package me.koneko.util;

import java.util.*;

public class ToString {
  
  public static String map(Map map) {
    StringBuilder sb = new StringBuilder().append("map {");
    for(Map.Entry et : (Set<Map.Entry>) map.entrySet()){
      sb.append(et.getKey()).append('=').append(et.getValue()).append(',').append(' ');
    }
    return sb.append('}').toString();
  }
  
}

