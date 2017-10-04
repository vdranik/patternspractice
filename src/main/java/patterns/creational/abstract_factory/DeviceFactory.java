package patterns.creational.abstract_factory;

public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
