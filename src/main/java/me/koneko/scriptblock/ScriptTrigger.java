package me.koneko.scriptblock;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import org.antlr.v4.runtime.*;

import me.koneko.blossom.parse.*;
import me.koneko.blossom.run.InterpreterVisitor;

public class ScriptTrigger {
  
  private ScriptTrigger(){}
  
  /**
   * 尝试触发一个脚本
   * @param type 动作类型
   * @param p 玩家
   */
  public static void trigger(int type, Location loc, Player p){
    String code;
    if ((code = BlockManager.get(loc, type)) != null){
      new BlossomParser(new CommonTokenStream(new BlossomLexer(
        CharStreams.fromString(ScriptManager.get(code)))))
        .file().accept(new InterpreterVisitor(p, loc));
    }
  }
  
  
  
  

}
