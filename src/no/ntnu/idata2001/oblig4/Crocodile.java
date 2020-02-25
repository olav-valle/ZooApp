package no.ntnu.idata2001.oblig4;

public class Crocodile extends Oviparous implements Walkable, Swimmable{

  public Crocodile(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean swim() {
    System.out.println("The crocodile swam.");
    return false;
  }

  @Override
  public boolean walk() {
    System.out.println("The crocodile walked.");
    return false;
  }

}
