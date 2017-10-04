package patterns.structural.proxy;

public class RealImage implements Image {

    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load(){
        System.out.println("Loading " + file);
    }

    @Override
    public void dispaly() {
        System.out.println("View " + file);
    }
}
