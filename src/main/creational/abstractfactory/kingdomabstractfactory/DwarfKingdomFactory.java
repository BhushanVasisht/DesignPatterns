package main.creational.abstractfactory.kingdomabstractfactory;

public class DwarfKingdomFactory implements KingdomAbstractFactory {
  @Override
  public Palace createPalace() {
    return new DwarfDwelling();
  }

  @Override
  public Army createArmy() {
    return null;
  }

  @Override
  public Ruler createRuler() {
    return new DwarfKing();
  }
}
