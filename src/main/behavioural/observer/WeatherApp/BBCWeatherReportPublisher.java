package main.behavioural.observer.WeatherApp;

import java.util.HashSet;
import java.util.Set;

public class BBCWeatherReportPublisher implements Publisher {

  Set<Subscriber> listeners;

  public BBCWeatherReportPublisher() {
    listeners = new HashSet<>();
  }

  @Override
  public void register(Subscriber sb) {
    System.out.println("Registering " + sb.toString());
    listeners.add(sb);
  }

  @Override
  public void unregister(Subscriber sb) {
    System.out.println("Unregistering " + sb.toString());
    listeners.remove(sb);
  }

  @Override
  public void update(String message) {
    for(Subscriber sb : listeners) {
      sb.listen(message);
    }
  }

}
