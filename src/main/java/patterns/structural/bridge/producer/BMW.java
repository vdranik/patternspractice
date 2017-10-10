package patterns.structural.bridge.producer;

public class BMW implements Producer{
    @Override
    public void setProducer() {
        System.out.println("BMW");
    }
}
