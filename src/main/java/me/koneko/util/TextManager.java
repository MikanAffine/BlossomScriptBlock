package me.koneko.util;

import java.util.*;

import org.bukkit.configuration.file.YamlConfiguration;

import static me.koneko.util.ConfigUtils.*;

/**
 * 管理文本之类的也比手动好啊..
 */
public final class TextManager {

  private TextManager() {}

  private static final HashMap<String, String> texts = new HashMap<>();

  public static void load(String config){
    if(!isConfigExists(config)) saveYamlConfig(config);
    YamlConfiguration cfg = getYamlConfig(config);
    for(String key : cfg.getKeys(true)){
      texts.put(key, cfg.getString(key));
    }
  }

  public static String getString(String key){
    return texts.get(key);
  }
  public static String getText(String key, String defaultString) {
    return texts.getOrDefault(key, defaultString);
  }

}