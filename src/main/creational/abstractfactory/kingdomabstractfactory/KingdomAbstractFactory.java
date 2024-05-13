package main.creational.abstractfactory.kingdomabstractfactory;

public interface KingdomAbstractFactory {
  Palace createPalace();
  Army createArmy();
  Ruler createRuler();
}
