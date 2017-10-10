package patterns.structural.bridge.producer;

public class Skoda implements Producer {

    @Override
    public void setProducer() {
        System.out.println("SKODA");
    }
}
