package test.creational.factory.phonefactory;

import main.creational.factory.phonefactory.PhoneFactory;

public class PhoneFactoryTest {

  public static void main(String[] args) {
    PhoneFactory phoneFactory = new PhoneFactory();

    phoneFactory.generatePhone("ios", "samsung");
    phoneFactory.generatePhone(null, "samsung");
    phoneFactory.generatePhone("ios");
    phoneFactory.generatePhone();
  }
}
