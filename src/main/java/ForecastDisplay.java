public class ForecastDisplay implements Observer {
    private int count;
    private double previousPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        count++;

        if (count == 1) {
            System.out.println("First measurement");
            previousPressure = pressure;
            return;
        }

        if (previousPressure > pressure) {
            System.out.println("Weather is getting worse"); 
        } else if (previousPressure < pressure) {
            System.out.println("Weather is improving");
        } else {
            System.out.println("Weather is stable");
        }
        previousPressure = pressure;
    }
}
