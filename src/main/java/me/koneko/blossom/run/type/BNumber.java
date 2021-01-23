package me.koneko.blossom.run.type;

public abstract class BNumber<T extends Number> extends BObject<Number>{

  @Override
  public abstract T get();

  @Override
  public String getType(){
    return "Number";
  }

  @Override
  public int hashCode(){
    return Float.hashCode(get().floatValue());
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj instanceof BNumber<?>) return get().floatValue() == ((BNumber<?>) obj).get().floatValue();
    return false;
  }

}

