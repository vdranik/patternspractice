package patterns.structural.proxy;

public class ProxyApp {

    private static final String FILE = "D:/images/my.jpg";

    public static void main(String[] args) {

        Image image = new RealImage(FILE);
        image.dispaly();  // if we not want call display method, we still load() image

        Image proxyImage = new ProxyImage(FILE);
        proxyImage.dispaly();
    }
}
