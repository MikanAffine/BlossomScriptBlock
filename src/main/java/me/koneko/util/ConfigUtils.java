package me.koneko.util;

import java.io.*;
import java.util.*;

import org.bukkit.configuration.file.YamlConfiguration;

import static me.koneko.util.Constants.*;

/**
 * 暂时只有YAML配置文件相关的
 * 以后可能会封装json, properties吧
 */
public final class ConfigUtils {

  private ConfigUtils() {
  }

  private static HashMap<String, YamlConfiguration> configs = new HashMap<>();

  /**
   * 获取你的插件文件夹下指定名称的yaml配置文件
   * 
   * @return yaml配置
   * @param s 要读的文件的字符串名
   */
  public static YamlConfiguration getYamlConfig(String s) {
    return getYamlConfig(s, false);
  }

  /**
   * 获取你的插件文件夹下指定名称的yaml配置文件
   *  
   * @return yaml配置
   * @param s 要读的文件的字符串名
   * @param forceReload 是否无论配置已经被加载过,都重新加载一遍
   */
  public static YamlConfiguration getYamlConfig(String s, boolean forceReload){
    if(forceReload) return getYamlConfig(new File(dataFolder, s));
    return configs.getOrDefault(s, getYamlConfig(new File(dataFolder, s)));
  }

  /**
   * 获取你的插件文件夹下指定名称的yaml配置文件
   * 
   * @return yaml配置
   * @param f 要读的文件
   */
  public static YamlConfiguration getYamlConfig(File f) {
    return YamlConfiguration.loadConfiguration(f);
  }

  /**
   * 保存yaml配置文件到你的插件的配置文件夹下
   * 
   * @param sr 要保存的文件的字符串名
   */
  public static void saveYamlConfig(String sr) {
    plugin.saveResource(sr, true);
  }

  /**
   * 检测配置文件是否在配置文件夹中
   * 
   * @param sr 要保存的文件的字符串名
   */
  public static boolean isConfigExists(String s) {
    return new File(dataFolder, s).exists();
  }

}
