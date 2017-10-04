package patterns.creational.abstract_factory.en;

import patterns.creational.abstract_factory.DeviceFactory;
import patterns.creational.abstract_factory.Keyboard;
import patterns.creational.abstract_factory.Mouse;
import patterns.creational.abstract_factory.Touchpad;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
