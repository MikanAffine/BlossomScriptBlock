package me.koneko.blossom.run.type;

public class BInteger extends BNumber<Integer>{

  private final int value;

  public BInteger(int v){
    value = v;
  }

  @Override
  public Integer get(){
    return value;
  }

  @Override
  public String getType(){
    return "Integer";
  }

  @Override
  public int hashCode(){
    return value;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj) return true;
    if(!(obj instanceof BObject<?>)) return false;
    Object v = ((BObject<?>) obj).get();
    if(v instanceof Integer) return value == ((Integer) v).intValue();
    else if(v instanceof Number) return value == ((Number) v).floatValue();
    return false;
  }

  @Override
  public BObject<?> add(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BInteger(value + ((Integer) v).intValue());
    else if(v instanceof Number) return new BFloat(((float) value) + ((Number) v).floatValue());
    return super.add(b);
  }

  @Override
  public BObject<?> sub(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BInteger(value - ((Integer) v).intValue());
    else if(v instanceof Number) return new BFloat(((float) value) - ((Number) v).floatValue());
    return super.sub(b);
  }

  @Override
  public BObject<?> mul(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BInteger(value * ((Integer) v).intValue());
    else if(v instanceof Number) return new BFloat(((float) value) * ((Number) v).floatValue());
    return super.mul(b);
  }

  @Override
  public BObject<?> div(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BInteger(value / ((Integer) v).intValue());
    else if(v instanceof Number) return new BFloat(((float) value) / ((Number) v).floatValue());
    return super.div(b);
  }

  @Override
  public BObject<?> mod(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return new BInteger(value % ((Integer) v).intValue());
    else if(v instanceof Number) return new BFloat(((float) value) % ((Number) v).floatValue());
    return super.mod(b);
  }

  @Override
  public BBoolean eq(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value == ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value == ((Number) v).floatValue());
    return BBoolean.by(false);
  }

  @Override
  public BBoolean neq(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value != ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value != ((Number) v).floatValue());
    return BBoolean.by(true);
  }

  @Override
  public BBoolean gtr(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value > ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value > ((Number) v).floatValue());
    return super.gtr(b);
  }

  @Override
  public BBoolean lss(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value < ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value < ((Number) v).floatValue());
    return super.lss(b);
  }

  @Override
  public BBoolean geq(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value >= ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value >= ((Number) v).floatValue());
    return super.geq(b);
  }

  @Override
  public BBoolean leq(BObject<?> b){
    Object v = b.get();
    if(v instanceof Integer) return BBoolean.by(value <= ((Integer) v).intValue());
    else if(v instanceof Number) return BBoolean.by(value <= ((Number) v).floatValue());
    return super.leq(b);
  }

}
