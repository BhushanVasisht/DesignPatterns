package main.creational.abstractfactory.kingdomabstractfactory;

public class ElfKingdomFactory implements KingdomAbstractFactory {

  @Override
  public Palace createPalace() {
    return new ElvenPalace();
  }

  @Override
  public Army createArmy() {
    return null;
  }

  @Override
  public Ruler createRuler() {
    return new ElfKing();
  }
}
