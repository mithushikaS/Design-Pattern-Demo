import java.util.ArrayList;
import java.util.List;

// Subject
interface WeatherStation {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setTemperature(double temperature);
}

// Concrete Subject
class WeatherData implements WeatherStation {
    private double temperature;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// Observer
interface Observer {
    void update(double temperature);
}

// Concrete Observer
class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.println(name + " Display: Temperature is " + temperature);
    }

}




