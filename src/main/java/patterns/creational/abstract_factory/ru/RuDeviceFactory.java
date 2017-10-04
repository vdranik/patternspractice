package patterns.creational.abstract_factory.ru;

import patterns.creational.abstract_factory.DeviceFactory;
import patterns.creational.abstract_factory.Keyboard;
import patterns.creational.abstract_factory.Mouse;
import patterns.creational.abstract_factory.Touchpad;

public class RuDeviceFactory implements DeviceFactory{

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
