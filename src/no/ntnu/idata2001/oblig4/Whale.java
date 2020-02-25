package no.ntnu.idata2001.oblig4;

public class Whale extends Mammal implements Swimmable, Jumpable{

  public Whale(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean jump() {
    System.out.println("The whale jumped.");
    return false;
  }

  @Override
  public boolean swim() {
    System.out.println("The whale swam.");
    return false;
  }
}
