package no.ntnu.idata2001.oblig4;

public class Whale extends Animal implements Swimmable, Jumpable{

  public Whale(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean jump() {
    return false;
  }

  @Override
  public boolean swim() {
    return false;
  }
  // TODO: 25/02/2020  implement Jumpable, Swimmable
  // TODO: 25/02/2020 extend Mammal
}
