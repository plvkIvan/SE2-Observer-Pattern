public class CurrentDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity, double pressure){
        System.out.println("Temperature = " + temperature +
                " Humidity = " + humidity + " Pressure = " + pressure);
    }
}
