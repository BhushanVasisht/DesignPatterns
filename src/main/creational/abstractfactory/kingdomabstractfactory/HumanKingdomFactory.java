package main.creational.abstractfactory.kingdomabstractfactory;

public class HumanKingdomFactory implements KingdomAbstractFactory {
  @Override
  public Palace createPalace() {
    return new HumanCastle();
  }

  @Override
  public Army createArmy() {
    return new HumanArmy();
  }

  @Override
  public Ruler createRuler() {
    return new HumanQueen();
  }
}
