package main.creational.factory.phonefactory.camera;

public class SamsungCamera extends BaseCamera {

  private int imageHi;
  private int imageTi;

  public SamsungCamera() {
    this.imageTi = 4096;
    this.imageHi = 2048;
  }

  @Override
  public int[][] click() {
    int[][] image = new int[imageTi][imageHi];

    for(int i = imageHi-1; i >=0; --i) {
      image[i] = getNextImageRow();
    }

    return image;
  }

  @Override
  public String getResolution() {
    return imageTi + "x" + imageHi;
  }

  private int[] getNextImageRow() {
    return new int[]{};
  }
}
