package patterns.structural.facade;

//Facade class
public class Computer {

    private Power power = new Power();
    private DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.loadDisk();
        hdd.copyFromDVD(dvd);
        dvd.unloadDisk();
    }
}
