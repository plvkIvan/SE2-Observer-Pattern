import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
}
