package me.koneko.scriptblock;

import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BsbCmd implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender p, Command c, String l, String[] args) {
    if(args.length == 0){
      p.sendMessage(HELP[0]);
      return true;
    }

    switch(args[0].toLowerCase()){
      case "help":
      try {
        p.sendMessage(HELP[Integer.parseInt(args[1])]);
      } catch(Exception e){
        p.sendMessage(HELP[0]);
      }
      return true;
      
      case "bind":
      if(!p.isOp()) return true;
      if(!(p instanceof Player)){
        p.sendMessage("只有玩家才能执行该指令");
        return true;
      }
      if(args.length != 3){
        p.sendMessage("/bsb bind 需要3个参数");
        return true;
      }
      Block b = ((Player) p).getTargetBlock(null, 10);
      if(b == null){
        return true;
      }
      BlockManager.bind(b.getLocation(), parseType(args[1]), args[2]);
      p.sendMessage("绑定成功");
      return true;

      case "unbind":
      if(!p.isOp()) return true;
      if(!(p instanceof Player)){
        p.sendMessage("只有玩家才能执行该指令");
        return true;
      }
      Block b2 = ((Player) p).getTargetBlock(null, 10);
      if(b2 == null){
        return true;
      }
      BlockManager.unbind(b2.getLocation());
      p.sendMessage("解绑成功");
      return true;

      default:
      p.sendMessage("未知子命令, 正在显示帮助");
      p.sendMessage(HELP[0]);
      return true;
    }
  }
  
  private static final String[][] HELP = new String[][]{
    new String[]{
      "=-=-=-= BlossomScriptBlock  帮助 =-=-=-=",
      "/bsb help - 显示此帮助",
      "",
      "/bsb bind <类型> <脚本名> - 将该脚本绑定到准星指向的方块",
      "<类型>: left_click, right_click, walk, break",
      "<脚本名>: 脚本文件名称",
      "",
      "/bsb unbind - 移除准星指向的方块上的脚本绑定",
      "=-=-=-=-=-= 第 1 页,  共 1 页 =-=-=-=-=-=",
    },
  };

  private static final int parseType(String s){
    switch(s.toLowerCase()){
      case "left_click": return 0;
      case "right_click": return 1;
      case "walk": return 2;
      case "break": return 3;
      default: return 1;
    }
  }
  
}