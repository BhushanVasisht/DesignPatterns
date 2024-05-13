package main.creational.factory.phonefactory.camera;

public abstract class BaseCamera {
  int imageTi = 1024;
  int imageHi = 720;

  public abstract int[][] click();

  public abstract String getResolution();
}
