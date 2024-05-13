package main.creational.abstractfactory.kingdomabstractfactory;

public class ElfKing implements Ruler {
  static final String DESCRIPTION = "This is the elven king!";

  @Override
  public void getDescription() {
    System.out.println(DESCRIPTION);
  }
}
