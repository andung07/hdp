package observer;

import java.util.Observable;
import java.util.Observer;

public class HistoryDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

     public HistoryDisplay(Observable o) {
         this.observable = o;
         this.observable.addObserver(this);
     }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("History display: %f, %f \n", temperature, humidity);
    }
}
