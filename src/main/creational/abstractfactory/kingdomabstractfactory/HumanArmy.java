package main.creational.abstractfactory.kingdomabstractfactory;

public class HumanArmy implements Army {
  @Override
  public void getDescription() {
    System.out.println("There are millions in this human army");
  }
}
