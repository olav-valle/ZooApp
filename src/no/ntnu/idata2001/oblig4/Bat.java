package no.ntnu.idata2001.oblig4;

public class Bat extends Animal implements Flyable {

  public Bat(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean fly() {
    return false;
  }
  // TODO: 25/02/2020 extend Mammal
  // TODO: 25/02/2020 implement Flyable
}
