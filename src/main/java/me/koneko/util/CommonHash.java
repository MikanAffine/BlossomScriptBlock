package me.koneko.util;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.*;

public final class CommonHash{

  public static final HashFunction md5 = Hashing.md5();
  public static final HashFunction sha1 = Hashing.sha1();
  public static final HashFunction sha256 = Hashing.sha256();
  public static final HashFunction sha384 = Hashing.sha384();
  public static final HashFunction sha512 = Hashing.sha512();
  public static final HashFunction crc32 = Hashing.crc32();
  public static final HashFunction murmur32 = Hashing.murmur3_32();
  public static final HashFunction murmur128 = Hashing.murmur3_128();
  public static final HashFunction sipHash24 = Hashing.sipHash24();

  public static final String md5(byte[] bs) {
    return md5.hashBytes(bs).toString();
  }

  public static final String sha1(byte[] bs) {
    return sha1.hashBytes(bs).toString();
  }

  public static final String sha256(byte[] bs) {
    return sha256.hashBytes(bs).toString();
  }

  public static final String sha384(byte[] bs) {
    return sha384.hashBytes(bs).toString();
  }

  public static final String sha512(byte[] bs) {
    return sha512.hashBytes(bs).toString();
  }

  public static final String crc32(byte[] bs) {
    return sha1.hashBytes(bs).toString();
  }

  public static final String murmur32(byte[] bs) {
    return murmur32.hashBytes(bs).toString();
  }

  public static final String murmur128(byte[] bs) {
    return murmur128.hashBytes(bs).toString();
  }

  public static final String sipHash24(byte[] bs) {
    return sipHash24.hashBytes(bs).toString();
  }
  
  public static final String md5(String s){
    return md5.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String sha1(String s) {
    return sha1.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String sha256(String s) {
    return sha256.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String sha384(String s) {
    return sha384.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String sha512(String s) {
    return sha512.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String crc32(String s) {
    return sha1.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String murmur32(String s) {
    return murmur32.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String murmur128(String s) {
    return murmur128.hashString(s, StandardCharsets.UTF_8).toString();
  }

  public static final String sipHash24(String s) {
    return sipHash24.hashString(s, StandardCharsets.UTF_8).toString();
  }

}