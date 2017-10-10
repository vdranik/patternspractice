package patterns.structural.bridge.car;

import patterns.structural.bridge.producer.Producer;

public abstract class Car {

    protected Producer producer;

    public Car(Producer producer){
        this.producer = producer;
    }

    protected abstract void showType();

    public void showDetails(){
        showType();
        producer.setProducer();
    }
}
