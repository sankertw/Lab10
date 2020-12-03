class Main {
  public static void main(String[] args) {
  Sugar tree = new Sugar("tree", false);
  tree.cutCookie("tree",10);
  tree.bakeCookie(350, 12);
  tree.decCookie();
  Sugar aCookie = new Sugar();
  aCookie.decCookie();
  }

}