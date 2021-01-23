package me.koneko.blossom.run;

import me.koneko.blossom.function.BlossomFunction;
import me.koneko.blossom.parse.*;
import me.koneko.blossom.run.type.*;

import java.util.*;

import org.bukkit.*;
import org.bukkit.entity.Player;

public class InterpreterVisitor extends BlossomBaseVisitor<BObject<?>>{

  public InterpreterVisitor(int x, int y, int z, String p){
    varTable.put("$x", new BInteger(x));
    varTable.put("$y", new BInteger(y));
    varTable.put("$z", new BInteger(z));
    varTable.put("$p", new BString(p));
  }

  public InterpreterVisitor(Player trigger, Location loc){
    this(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ(), trigger.getName());
  }

  public InterpreterVisitor(Player trigger){
    this(trigger, trigger.getLocation());
  }

  public InterpreterVisitor(){
    this(0, 0, 0, "");
  }

  /**
   * built-in variables: $x $y $z $p
   */
  public HashMap<String, BObject<?>> varTable = new HashMap<>();

  @Override
  public BObject<?> visitCond(BlossomParser.CondContext ctx){
    BObject<?> left = visitExpr(ctx.expr());
    if(ctx.getChildCount() == 3){
      BObject<?> right = visitCond(ctx.cond());
      switch(ctx.RelatOp().getText()){
        case "==":
          return left.eq(right);
        case "!=":
          return left.neq(right);
        case ">":
          return left.gtr(right);
        case "<":
          return left.lss(right);
        case ">=":
          return left.geq(right);
        case "<=":
          return left.leq(right);
      }
    }
    return left;
  }

  @Override
  public BObject<?> visitExpr(BlossomParser.ExprContext ctx){
    BObject<?> left = visitTerm(ctx.term());
    if(ctx.getChildCount() == 3){
      BObject<?> right = visitExpr(ctx.expr());
      switch(ctx.CalcOp0().getText()){
        case "+":
          return left.add(right);
        case "-":
          return left.sub(right);
        default: throw new RuntimeException("Unknown CalcOp " + ctx.CalcOp0().getText());
      }
    }
    return left;
  }

  @Override
  public BObject<?> visitTerm(BlossomParser.TermContext ctx){
    BObject<?> left = visitFactor(ctx.factor());
    if(ctx.getChildCount() == 3){
      BObject<?> right = visitTerm(ctx.term());
      switch(ctx.CalcOp1().getText()){
        case "*":
          return left.mul(right);
        case "/":
          return left.div(right);
        case "%":
          return left.mod(right);
        default: throw new RuntimeException("Unknown CalcOp " + ctx.CalcOp1().getText());
      }
    }
    return left;
  }

  @Override
  public BObject<?> visitFactor(BlossomParser.FactorContext ctx){
    if(ctx.getStart().getType() == BlossomLexer.LParen){
      return visitExpr(ctx.expr());
    }
    else if(ctx.getChildCount() == 1){
      BlossomParser.LiteralContext tn = ctx.literal();
      if(tn != null){
        if(tn.Integer() != null)
          return new BInteger(Integer.parseInt(tn.Integer().getText()));
        else if(tn.Float() != null)
          return new BFloat(Float.parseFloat(tn.Float().getText()));
        else if(tn.String() != null)
          return new BString(tn.String().getText().substring(1, tn.String().getText().length()-1));
        throw new RuntimeException("type: " + tn.getStart().getType() + ",text: " + tn.getText());
      }
      BObject<?> v = varTable.get(ctx.Identifier().getText());
      if(v == null) throw new RuntimeException("Unknown var name:" + ctx.Identifier().getText());
      return v;
    } else{
      return BlossomFunction.functions.get(ctx.Identifier().getText()).call(asList(ctx.list()));
    }
  }

  @Override
  public BObject<?> visitVarDeclare(BlossomParser.VarDeclareContext ctx){
    varTable.put(ctx.Identifier().getText(), ctx.Assign() == null ? null : visitCond(ctx.cond()));
    return null;
  }

  @Override
  public BObject<?> visitIfStmt(BlossomParser.IfStmtContext ctx){
    if(BBoolean.TRUE == visitCond(ctx.cond())){
      BlossomParser.StmtContext stmt = ctx.stmt(0);
      if(stmt.blockStmt() == null) visitStmt(stmt);
      else stmt.blockStmt().stmt().forEach(this::visitStmt);
    } else if(ctx.Else() != null){
      BlossomParser.StmtContext stmt = ctx.stmt(1);
      if(stmt.blockStmt() == null) visitStmt(stmt);
       else stmt.blockStmt().stmt().forEach(this::visitStmt);
    }
    return null;
  }

  @Override
  public BObject<?> visitWhileStmt(BlossomParser.WhileStmtContext ctx){
    BlossomParser.StmtContext stmt = ctx.stmt();
    boolean isBlock = stmt.blockStmt() != null;
    outer: while(BBoolean.TRUE == visitCond(ctx.cond())){
      if(isBlock){
        for(BlossomParser.StmtContext sc : stmt.blockStmt().stmt()){
          if(sc.breakStmt() != null) return null;
          if(sc.continueStmt() != null) continue outer;
          BObject<?> v = visitStmt(sc);
        }
      }
      else visitStmt(stmt);
    }
    return null;
  }

  private BObject<?>[] asList(BlossomParser.ListContext ctx){
    return ctx.cond().stream().map(this::visitCond).toArray(BObject<?>[]::new);
  }

}
