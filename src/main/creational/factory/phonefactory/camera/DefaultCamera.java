package main.creational.factory.phonefactory.camera;

public class DefaultCamera extends BaseCamera {
  @Override
  public int[][] click() {
    return new int[0][];
  }

  @Override
  public String getResolution() {
    return super.imageHi + "x" + super.imageTi;
  }
}
