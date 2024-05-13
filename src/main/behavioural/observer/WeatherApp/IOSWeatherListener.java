package main.behavioural.observer.WeatherApp;

public class IOSWeatherListener implements Subscriber {
  @Override
  public void listen(String message) {
    System.out.println("IOS Weather app got update: " + message);
  }
}
