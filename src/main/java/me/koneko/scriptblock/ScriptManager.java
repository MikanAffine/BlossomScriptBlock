package me.koneko.scriptblock;

import java.util.*;
import java.io.*;

import me.koneko.util.*;
import static me.koneko.util.Constants.*;

public final class ScriptManager{

  private static final HashMap<String, String> scriptStore = new HashMap<>();

  public static final String get(String s){
    return scriptStore.get(s);
  }

  public static final void load(){
    scriptStore.clear();
    try{
      File folder = new File(dataFolder, "/script");
      if(!folder.exists()){
        folder.mkdirs();
        return;
      }
      Arrays.stream(folder.listFiles((f, s) -> s.endsWith(".bl"))).forEach(f -> 
        scriptStore.put(f.getName().replace(".bl", ""), FileUtils.readAsString(f)));
    }catch(Exception e){
      e.printStackTrace();
    }
  }


}