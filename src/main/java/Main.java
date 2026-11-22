public class Main {
    static void main(String[] args) {
        WeatherData data = new WeatherData();

        Observer current = new CurrentDisplay();
        data.addObserver(current);

        Observer forecast = new ForecastDisplay();
        data.addObserver(forecast);

        Observer statistic = new StatisticsDisplay();
        data.addObserver(statistic);

        data.setMeasurements(20, 60, 1000);
        data.setMeasurements(25, 55, 1020);
        data.setMeasurements(15, 70, 1000);

        data.deleteObserver(current);

        data.setMeasurements(18, 65,1015);

    }
}
