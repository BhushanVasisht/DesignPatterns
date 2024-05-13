package main.creational.abstractfactory.kingdomabstractfactory;

public class ElvenPalace implements Palace {

  @Override
  public void getDescription() {
    System.out.println("This is an elven castle built on the highest tree");
  }
}
