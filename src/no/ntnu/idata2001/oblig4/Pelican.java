package no.ntnu.idata2001.oblig4;

public class Pelican extends Animal implements Walkable, Flyable{

  public Pelican(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean fly() {
    return false;
  }

  @Override
  public boolean walk() {
    return false;
  }
  // TODO: 25/02/2020 implement Walkable, Flyable
  // TODO: 25/02/2020 Extend Oviparous
}
