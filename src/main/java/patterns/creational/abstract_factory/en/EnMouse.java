package patterns.creational.abstract_factory.en;

import patterns.creational.abstract_factory.Mouse;

public class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Click mouse");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click mouse");
    }

    @Override
    public void scroll(int direction) {

        if(direction > 0) {
            System.out.println("Scroll mouse up");
        } else if (direction < 0) {
            System.out.println("Scroll mouse down");
        } else  System.out.println("No scroll");
    }
}
