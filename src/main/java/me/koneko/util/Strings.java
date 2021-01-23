package me.koneko.util;

public final class Strings{
  private Strings(){}

  public static String repeat(String s, int c){
    StringBuilder sb = new StringBuilder(c * s.length());
    while(c-->0) sb.append(s);
    return sb.toString();
  }

}
