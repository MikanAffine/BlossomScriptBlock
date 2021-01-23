package me.koneko.blossom.run.type;

/**
 * base interface of objects in interpreter
 * declared some useful method
 *
 * for calculation operators, plz return a new BObject
 */
public abstract class BObject<T>{

  public abstract T get();

  // General things
  protected final BObject<T> unsupported(String s){
    throw new UnsupportedOperationException(this.getClass().getSimpleName() + s);
  }

  public String getType(){
    return this.getClass().getSimpleName();
  }

  @Override
  public int hashCode(){
    return get().hashCode();
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    }
    if (obj instanceof BObject) {
      return get().equals(((BObject<?>) obj).get());
    }
    return false;
  }

  @Override
  public String toString(){
    return "[" + getType() + "] value=" + get().toString();
  }

  // Calculation Operators

  /**
   * @param b the other BObject
   * @return this + the other
   */
  public BObject<?> add(BObject<?> b){
    return unsupported(": Doesn't support operator [add]");
  }

  /**
   * @param b the other BObject
   * @return this - the other
   */
  public BObject<?> sub(BObject<?> b){
    return unsupported(": Doesn't support operator [subtract]");
  }

  /**
   * @param b the other BObject
   * @return this * the other
   */
  public BObject<?> mul(BObject<?> b){
    return unsupported(": Doesn't support operator [multiply]");
  }

  /**
   * @param b the other BObject
   * @return this / the other
   */
  public BObject<?> div(BObject<?> b){
    return unsupported(": Doesn't support operator [divide]");
  }

  /**
   * @param b the other BObject
   * @return this % the other
   */
  public BObject<?> mod(BObject<?> b){
    return unsupported(": Doesn't support operator [modulo]");
  }

  // Relation Operators

  /**
   * @param b the other BObject
   * @return is this equals to the other
   */
  public BBoolean eq(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [equal]");
  }

  /**
   * @param b the other BObject
   * @return is this not equals to the other
   */
  public BBoolean neq(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [not equal]");
  }

  /**
   * @param b the other BObject
   * @return is this greater than the other
   */
  public BBoolean gtr(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [greater]");
  }

  /**
   * @param b the other BObject
   * @return is this less than the other
   */
  public BBoolean lss(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [less]");
  }

  /**
   * @param b the other BObject
   * @return is this equals to or greater than the other
   */
  public BBoolean geq(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [greater or equal]");
  }

  /**
   * @param b the other BObject
   * @return is this equals to or less than the other
   */
  public BBoolean leq(BObject<?> b){
    return (BBoolean) unsupported(": Doesn't support operator [less or equal]");
  }

}
