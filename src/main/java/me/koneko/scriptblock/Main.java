package me.koneko.scriptblock;

import static me.koneko.util.Constants.*;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class Main extends JavaPlugin{

  @Override
  public void onEnable(){
    loadConstants();
    ScriptManager.load();
    BlockManager.load();
    Bukkit.getPluginCommand("bsb").setExecutor(new BsbCmd());
    pluginManager.registerEvents(new BlockInteractListener(), plugin);
  }

  @Override
  public void onDisable(){
    BlockManager.save();
  }

}
