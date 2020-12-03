class Sugar extends Cookie{
  String cookShape;
  boolean isDecorated;

  public Sugar(){
    cookShape ="";
    isDecorated = false;
  }
  public Sugar(String aCookShape, boolean aIsDecorated){
    cookShape = aCookShape;
    isDecorated = aIsDecorated;

  }
  public String getShape(){
    return cookShape;
  }
  public void setShape(String aCookShape){
    this.cookShape = aCookShape;
  }
  public void cutCookie(String cookShape, int cookCount){
    getShape();
    System.out.println(cookCount + " cookies were cut into " + cookShape);
    super.setCount(cookCount);
  }
  public void decCookie(){
    if(super.getIsBaked()){
      isDecorated = true;
      System.out.println("The Cookies were decorated");
    } else {
      System.out.println("Make sure to bake the cookies first!");
    }
  }
}