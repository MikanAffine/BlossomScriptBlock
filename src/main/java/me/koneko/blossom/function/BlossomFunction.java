package me.koneko.blossom.function;

import me.koneko.blossom.run.*;
import me.koneko.blossom.run.type.BFloat;
import me.koneko.blossom.run.type.BObject;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public interface BlossomFunction{

  BObject<?> call(BObject<?>[] args);

  BlossomFunction SIN = args -> new BFloat((float) Math.sin(((Number) args[0].get()).floatValue()));
  BlossomFunction COS = args -> new BFloat((float) Math.cos(((Number) args[0].get()).floatValue()));
  BlossomFunction TAN = args -> new BFloat((float) Math.tan(((Number) args[0].get()).floatValue()));

  BlossomFunction LOG = args -> {System.out.println(args[0].get()); return null;};

  BlossomFunction CMD = args -> {
    Bukkit.dispatchCommand(Bukkit.getPlayer((String) args[0].get()), (String) args[1].get());
    return null;};
  BlossomFunction CMDOP = args -> {
    Player p = Bukkit.getPlayer((String) args[0].get());
    if(p.isOp()){
      Bukkit.dispatchCommand(p, (String) args[1].get());
      return null;
    }
    p.setOp(true);
    Bukkit.dispatchCommand(p, (String) args[1].get());
    p.setOp(false);
    return null;
  };
  BlossomFunction CMDCON = args -> {
    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), (String) args[1].get());
    return null;
  };

  HashMap<String, BlossomFunction> functions = new HashMap<String, BlossomFunction>(){{
    put("sin", SIN);
    put("cos", COS);
    put("tan", TAN);
    put("log", LOG);
    put("cmd", CMD);
    put("cmdop", CMDOP);
    put("cmdcon", CMDCON);
  }};

}
