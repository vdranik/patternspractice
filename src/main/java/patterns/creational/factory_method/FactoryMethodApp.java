package patterns.creational.factory_method;

public class FactoryMethodApp {

    public static void main(String[] args) {

        WatchMaker watchMaker = getWatchMakerByName(Maker.DIGITAL);
        Watch watch = watchMaker.createWatch();

        watch.showTime();
    }

    public static WatchMaker getWatchMakerByName(Maker maker){

        switch (maker){
            case DIGITAL: return new DigitalWatchMaker();
            case ROME: return new RomeWatchMaker();
            default: throw new RuntimeException("Nonsupported watchmaker");
        }
    }
}
