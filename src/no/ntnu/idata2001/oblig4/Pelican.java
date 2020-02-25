package no.ntnu.idata2001.oblig4;

public class Pelican extends Oviparous implements Walkable, Flyable{

  public Pelican(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean fly() {
    System.out.println("The pelican flew.");
    return false;
  }

  @Override
  public boolean walk() {
    System.out.println("The pelican walked.");
    return false;
  }
}
