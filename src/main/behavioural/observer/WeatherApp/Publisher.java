package main.behavioural.observer.WeatherApp;

public interface Publisher {
  public void register(Subscriber sb);

  public void unregister(Subscriber sb);

  public void update(String message);
}
