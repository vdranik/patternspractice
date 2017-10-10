package patterns.structural.bridge;

import patterns.structural.bridge.car.Car;
import patterns.structural.bridge.car.Hatchback;
import patterns.structural.bridge.car.Sedan;
import patterns.structural.bridge.producer.BMW;
import patterns.structural.bridge.producer.Kia;

public class BridgeApp {
    public static void main(String[] args) {
        Car car = new Sedan(new Kia());
        car.showDetails();

        Car car2 = new Hatchback(new Kia());
        car2.showDetails();

        Car car3 = new Sedan(new BMW());
        car3.showDetails();
    }
}
