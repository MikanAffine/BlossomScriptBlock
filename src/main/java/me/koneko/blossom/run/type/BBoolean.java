package me.koneko.blossom.run.type;

public class BBoolean extends BObject<Boolean>{

  private final boolean value;

  public static final BBoolean TRUE = new BBoolean(true);
  public static final BBoolean FALSE = new BBoolean(false);

  public static BBoolean by(boolean b){
    return b ? TRUE : FALSE;
  }

  private BBoolean(boolean b){
    value = b;
  }

  @Override
  public Boolean get(){
    return value;
  }

  @Override
  public String getType(){
    return "Bool";
  }

  @Override
  public boolean equals(Object obj){
    return this == obj;
  }

  @Override
  public BBoolean eq(BObject<?> b){
    return this == b ? TRUE : FALSE;
  }

  @Override
  public BBoolean neq(BObject<?> b){
    return this == b ? FALSE : TRUE;
  }

}