package patterns.creational.abstract_factory.en;

import patterns.creational.abstract_factory.Keyboard;

public class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void println() {
        System.out.println("Print Line");
    }
}
