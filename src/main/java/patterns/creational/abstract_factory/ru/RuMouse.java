package patterns.creational.abstract_factory.ru;

import patterns.creational.abstract_factory.Mouse;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {

        if(direction > 0) {
            System.out.println("Скролл мышью вверх");
        } else if (direction < 0) {
            System.out.println("Скролл мышью вниз");
        } else  System.out.println("Не скролим");
    }
}
