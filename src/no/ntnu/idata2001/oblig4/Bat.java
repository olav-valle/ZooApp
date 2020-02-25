package no.ntnu.idata2001.oblig4;

public class Bat extends Mammal implements Flyable {

  public Bat(String name, int code) {
    super(name, code);
  }

  @Override
  public boolean fly() {
    System.out.println("The bat flew.");
    return false;
  }
}
