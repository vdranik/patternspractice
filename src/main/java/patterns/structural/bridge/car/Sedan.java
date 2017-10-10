package patterns.structural.bridge.car;

import patterns.structural.bridge.producer.Producer;

public class Sedan extends Car {

    public Sedan(Producer producer) {
        super(producer);
    }

    @Override
    public void showType(){
        System.out.println("Sedan");
    }
}
