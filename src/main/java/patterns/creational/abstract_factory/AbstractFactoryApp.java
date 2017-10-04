package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.en.EnDeviceFactory;
import patterns.creational.abstract_factory.ru.RuDeviceFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode(Factory.RU);
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10,40);
    }

    private static DeviceFactory getFactoryByCountryCode(Factory factory){
        switch (factory){
            case EN: return new EnDeviceFactory();
            case RU: return new RuDeviceFactory();
            default: throw new RuntimeException("Unsupported country code " + factory);
        }
    }
}
