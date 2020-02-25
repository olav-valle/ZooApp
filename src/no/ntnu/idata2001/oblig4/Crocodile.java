package no.ntnu.idata2001.oblig4;

public class Crocodile extends Animal implements Walkable, Swimmable{

  public Crocodile(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean swim() {
    return false;
  }

  @Override
  public boolean walk() {
    return false;
  }

  // TODO: 25/02/2020 extend Oviparous
  // TODO: 25/02/2020 implement Swimmable, Walkable
}
