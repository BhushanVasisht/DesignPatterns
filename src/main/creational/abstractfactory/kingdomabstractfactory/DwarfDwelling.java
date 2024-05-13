package main.creational.abstractfactory.kingdomabstractfactory;

public class DwarfDwelling implements Palace {

  @Override
  public void getDescription() {
    System.out.println("This is a dwarf cave deep underground");
  }
}
