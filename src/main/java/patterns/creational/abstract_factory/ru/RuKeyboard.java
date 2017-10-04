package patterns.creational.abstract_factory.ru;

import patterns.creational.abstract_factory.Keyboard;

public class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Печать");
    }

    @Override
    public void println() {
        System.out.println("Печать с новой строки");
    }
}
