package test.creational.abstractfactory.kingdomabstractfactor;

import main.creational.abstractfactory.kingdomabstractfactory.Army;
import main.creational.abstractfactory.kingdomabstractfactory.DwarfKingdomFactory;
import main.creational.abstractfactory.kingdomabstractfactory.ElfKingdomFactory;
import main.creational.abstractfactory.kingdomabstractfactory.HumanKingdomFactory;
import main.creational.abstractfactory.kingdomabstractfactory.KingdomAbstractFactory;

public class KingdomAbstractFactoryTest {

  public static void main(String[] args) {
    //Elven Kingdom
    KingdomAbstractFactory abstractFactory = new ElfKingdomFactory();
    abstractFactory.createPalace().getDescription();
    abstractFactory.createRuler().getDescription();
    Army elfArmy = abstractFactory.createArmy();

    if(elfArmy != null) elfArmy.getDescription();
    else System.out.println("No elf army");

    //Dwarf Kingdom
    abstractFactory = new DwarfKingdomFactory();
    abstractFactory.createPalace().getDescription();
    abstractFactory.createRuler().getDescription();
    Army dwarfArmy = abstractFactory.createArmy();

    if(dwarfArmy != null) dwarfArmy.getDescription();
    else System.out.println("No dwarf army");


    //Dwarf Kingdom
    abstractFactory = new HumanKingdomFactory();
    abstractFactory.createPalace().getDescription();
    abstractFactory.createRuler().getDescription();
    Army humanArmy = abstractFactory.createArmy();

    if(humanArmy != null) humanArmy.getDescription();
    else System.out.println("No human army");
  }
}
