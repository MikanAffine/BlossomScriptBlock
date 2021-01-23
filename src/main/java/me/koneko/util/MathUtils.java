package me.koneko.util;

public final class MathUtils{

  /**
   * 不要实例化这个类
   */
  private MathUtils(){}

  /**
   * 求大于等于某数的2的幂
   * 
   * @param i 数
   * @return 大于等于该数的2的幂
   */
  public static int roundToPowerOf2(int i){
    --i;
    i |= i >>> 1;
    i |= i >>> 2;
    i |= i >>> 4;
    i |= i >>> 8;
    i |= i >>> 16;
    return i + 1;
  }

}