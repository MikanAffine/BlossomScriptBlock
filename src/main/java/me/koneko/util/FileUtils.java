package me.koneko.util;

import java.io.*;
import java.util.*;

import static me.koneko.util.CommonHash.*;

public final class FileUtils{

  /**
   * 我还是不赞同你实例化这个类
   */
  private FileUtils(){}

// 读取文件相关的封装方法

  /**
   * 按字节读文件,将文件转化为字节数组
   * 无法读取超过2GiB的文件!(2,147,483,647Byte)
   * 调优好几次了,大约是200mb/s上下,1ms够读几十个配置文件了
   * 
   * @return 按字节读文件得到的字节数组
   * @param f 要读的文件
   */
  public static byte[] readAsByteArray(File f){
    int fl = (int) f.length();
    // 1024的整数倍的数组,read比较快
    byte[] buf = new byte[fl > 512 ? MathUtils.roundToPowerOf2(fl) : 1024];
    try (FileInputStream fis = new FileInputStream(f)) {
      fis.read(buf);
    } catch (IOException e) {
      e.printStackTrace();
    }
    byte[] result = new byte[fl];
    System.arraycopy(buf, 0, result, 0, fl);
    return result;
  }

  /**
   * 按行读文件,将文件转化为字符串数组
   * 
   * @return 按行读文件得到的字符串数组
   * @param f 要读的文件
   */
  public static String[] readAsStringArray(File f) {
    // 我觉得512行差不多了吧
    List<String> result = new ArrayList<>(512);
    String buf = null;
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
      while((buf = br.readLine()) != null) result.add(buf);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result.toArray(new String[0]);
  }

  /**
   * 按行读文件,将文件转化为字符串,包含换行符
   * 该方法可能会多一个换行符
   * 
   * @return 读文件得到的字符串
   * @param f 要读的文件
   */
  public static String readAsString(File f){
    StringBuilder sb = new StringBuilder();
    String buf = null;
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
      while ((buf = br.readLine()) != null) sb.append(buf).append("\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }

// 文件哈希值相关，用于校验

  /**
   * 较快速,追求速度时推荐使用
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileMd5(File f){
    return md5(readAsByteArray(f));
  }

  /**
   * 比MD5安全些
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileSha1(File f) {
    return sha1(readAsByteArray(f));
  }

  /**
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileSha256(File f) {
    return CommonHash.sha256(readAsByteArray(f));
  }

  /**
   * 最安全,速度最慢，不过没有慢到哪去
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileSha512(File f) {
    return sha512(readAsByteArray(f));
  }

  /**
   * 实际上crc32比md5慢，还是用md5
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileCrc32(File f) {
    return crc32(readAsByteArray(f));
  }

  /**
   * 最快
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileMurmur32Hash(File f) {
    return murmur32(readAsByteArray(f));
  }

  /**
   * 第二快,也足够安全
   * 
   * @param f 文件
   * @return 文件MD5
   */
  public static String getFileMurmur128Hash(File f) {
    return murmur128(readAsByteArray(f));
  }

}