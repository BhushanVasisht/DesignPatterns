package test.behavioural.observer.WeatherApp;

import main.behavioural.observer.WeatherApp.AndroidWeatherListener;
import main.behavioural.observer.WeatherApp.BBCWeatherReportPublisher;
import main.behavioural.observer.WeatherApp.IOSWeatherListener;

public class WeatherAppTest {

  public static void main(String[] args) {
    BBCWeatherReportPublisher publisher = new BBCWeatherReportPublisher();

    //listeners
    AndroidWeatherListener awListener = new AndroidWeatherListener();
    IOSWeatherListener iwListener = new IOSWeatherListener();

    publisher.register(awListener);
    publisher.register(iwListener);

    publisher.update("Hello....sending weather report for London: 78C");

    publisher.unregister(iwListener);

    publisher.update("Hello....sending weather report for NYC: 22C");
  }
}
