package patterns.structural.proxy;

public class ProxyImage implements Image {

    private String file;
    private RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void dispaly() {
        if(realImage == null){
            realImage = new RealImage(file);
        }

        realImage.dispaly();
    }
}
