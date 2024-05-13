package main.behavioural.observer.WeatherApp;

public class AndroidWeatherListener implements Subscriber {

  @Override
  public void listen(String message) {
    System.out.println("Android Weather app got update: " + message);
  }
}
