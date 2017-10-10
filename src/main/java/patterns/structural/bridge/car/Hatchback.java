package patterns.structural.bridge.car;

import patterns.structural.bridge.producer.Producer;

public class Hatchback extends Car {

    public Hatchback(Producer producer) {
        super(producer);
    }

    @Override
    public void showType(){
        System.out.println("Hatchback");
    }
}
