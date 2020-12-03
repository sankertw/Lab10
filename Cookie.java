public class Cookie {
  protected int cookCount;
  protected int cookTemp;
  protected int cookTime;
  protected boolean isBaked;

  public Cookie(){
    cookCount = 0;
    cookTemp = 0;
    cookTime = 0;
    isBaked = false;
  }
  public Cookie(int aCookCount, int aCookTemp, int aCookTime, boolean aIsBaked){
    cookCount = aCookCount;
    cookTemp = aCookTemp;
    cookTime = aCookTime;
    isBaked = aIsBaked;
  }
  public boolean getIsBaked(){
    return isBaked;
  }
  public void setCount(int aCookCount){
    cookCount = aCookCount;
  }
  public void bakeCookie(int cookTemp, int cookTime){
    System.out.println(cookCount + " Cookies were baked at " + cookTemp + " degrees F for " + cookTime +  " minutes ");
    isBaked = true;
  }
}
