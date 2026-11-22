public class StatisticsDisplay implements Observer {
    private int count;
    private double sumTemparature;
    private double maxTemperature;
    private double minTemperature;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if(count == 0) {
            minTemperature = temperature;
            maxTemperature = temperature;
        }

        count++;
        sumTemparature += temperature;

        if(temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if(temperature < minTemperature) {
            minTemperature = temperature;
        }

        System.out.println("Max Temperature = " + maxTemperature +
                " Min Temperature " + minTemperature +
                " Average Temperature = " + sumTemparature / count);

    }
}
