public class Observer1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        weatherData.addObserver(display1);
        weatherData.addObserver(display2);

        weatherData.setTemperature(25.5);
        weatherData.setTemperature(30.0);

        weatherData.removeObserver(display1);

        weatherData.setTemperature(28.7);
    }
}
