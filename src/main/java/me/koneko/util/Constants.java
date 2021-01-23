package me.koneko.util;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.scheduler.BukkitScheduler;

public final class Constants {
  
  /**
   * 你没有任何正当理由去获取这个类的实例，
   * 这个构造器蕴含了伟大的力量，一旦构造就马上崩服，
   * 我知道，你现在可能会用Unsafe来构造这个类的实例，
   * 但是到底有什么意义！！！
   */
  private Constants(){
    //System.exit(0);
    Bukkit.shutdown();
  }

  public static Plugin plugin = null;
  public static File dataFolder = null;
  public static Server server = null;
  public static Logger logger = null;
  public static PluginManager pluginManager = null;
  public static ServicesManager serviceManager = null;
  public static PluginLoader pluginLoader = null;
  public static BukkitScheduler scheduler = null;
  public static ConsoleCommandSender console = null;
  public static ClassLoader classLoader = null;

  public static final boolean isDebugging = true;

  /**
   * 给常量赋值
   */
  public static void loadConstants(){
    plugin = Bukkit.getPluginManager().getPlugin("BlossomScriptBlock");
    dataFolder = plugin.getDataFolder();
    server = plugin.getServer();
    logger = plugin.getLogger();
    pluginLoader = plugin.getPluginLoader();
    pluginManager = server.getPluginManager();
    scheduler = server.getScheduler();
    console = server.getConsoleSender();
    classLoader = plugin.getClass().getClassLoader();
  }

}
