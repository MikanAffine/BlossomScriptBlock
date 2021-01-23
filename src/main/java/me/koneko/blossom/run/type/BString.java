package me.koneko.blossom.run.type;

import me.koneko.util.Strings;

public class BString extends BObject<String>{

  private final String value;

  public BString(String v){
    value = v;
  }

  @Override
  public String get(){
    return value;
  }

  @Override
  public String getType(){
    return "String";
  }

  @Override
  public int hashCode(){
    return value.hashCode();
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj) return true;
    if(!(obj instanceof BObject<?>)) return false;
    return value.equals(((BObject<?>) obj).get());
  }

  @Override
  public BObject<?> add(BObject<?> b){
    Object v = b.get();
    return new BString(value.concat(v.toString()));
  }

  @Override
  public BObject<?> mul(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BString(Strings.repeat(value, (Integer) v));
    return unsupported(" string only supports string * integer");
  }

  @Override
  public BBoolean eq(BObject<?> b){
    return value.equals(b.get()) ? BBoolean.TRUE : BBoolean.FALSE;
  }

  @Override
  public BBoolean neq(BObject<?> b){
    return value.equals(b.get()) ? BBoolean.FALSE : BBoolean.TRUE;
  }

}
