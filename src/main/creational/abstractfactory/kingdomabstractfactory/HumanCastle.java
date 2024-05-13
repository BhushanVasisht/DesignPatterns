package main.creational.abstractfactory.kingdomabstractfactory;

public class HumanCastle implements Palace {

  @Override
  public void getDescription() {
    System.out.println("This is the majestic palace of the house Grey");
  }
}
