package patterns.structural.facade;

import java.util.Comparator;

public class FacadeApp {
    public static void main(String[] args) {

        Power power = new Power();
        power.on();
        DVDRom dvd = new DVDRom();
        dvd.loadDisk();
        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);
        dvd.unloadDisk();

        System.out.println("------------");

        //Facade style
        Computer computer = new Computer();
        computer.copy();

    }
}
