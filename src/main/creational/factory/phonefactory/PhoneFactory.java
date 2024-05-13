package main.creational.factory.phonefactory;

import main.creational.factory.phonefactory.camera.BaseCamera;
import main.creational.factory.phonefactory.camera.DefaultCamera;
import main.creational.factory.phonefactory.camera.SamsungCamera;
import main.creational.factory.phonefactory.os.AndroidOS;
import main.creational.factory.phonefactory.os.IOS;

public class PhoneFactory {

  public void generatePhone(String os, String camera) {
    generatePhoneHelper(os, camera);
  }

  public void generatePhone(String os) {
    generatePhoneHelper(os, "default");
  }

  public void generatePhone() {
    generatePhoneHelper("default", "default");
  }

  private void generatePhoneHelper(String os, String camera) {
    if (os != null && os.equals("ios")) {
      new IOS().show();
    } else {
      new AndroidOS().show();
    }

    if (camera != null && camera.equals("samsung")) {
      System.out.println(new SamsungCamera().getResolution());
    } else {
      System.out.println(new DefaultCamera().getResolution());
    }
  }
}
