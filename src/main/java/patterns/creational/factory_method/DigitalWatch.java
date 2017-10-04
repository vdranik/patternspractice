package patterns.creational.factory_method;

import java.time.LocalTime;

public class DigitalWatch implements Watch{
    public void showTime() {
        System.out.println(LocalTime.now());
    }
}
