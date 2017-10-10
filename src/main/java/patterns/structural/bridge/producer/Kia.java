package patterns.structural.bridge.producer;

public class Kia implements Producer {

    @Override
    public void setProducer() {
        System.out.println("KIA");
    }
}
