package me.koneko.util;

import org.bukkit.Location;

public class HashAlgorithms {
  
  public static final long seed = 0xad0319fc;
  
  /**
   * 吊打Location内置的hashCode()
   * 平均发生碰撞时调用累计次数: 9492189
   * 原来的hashCode(): 79184
   * 性能上，运算一次时间应该不超过2倍
   * 强力证明hashCode()就是要瞎几把写
   * @param loc 坐标
   * @return hashCode
   */
  public static long location(Location loc){
    long l = seed;
    int x = loc.getBlockX(), y = loc.getBlockY(), z = loc.getBlockZ(),
      pitch = (int) loc.getPitch(), yaw = (int) loc.getYaw();
    l *= loc.getWorld().getName().toLowerCase().hashCode();
    l ^= x << 23;
    l *= 31;
    l ^= y << 7;
    l ^= z << 17;
    l ^= l >>> 12;
    l *= yaw;
    l ^= l >>> 5;
    l ^= (x<<32) ^ (y<<16) ^ (z<<8) ^ yaw*7;
    l += pitch*19;
    return l;
  }
  
}
