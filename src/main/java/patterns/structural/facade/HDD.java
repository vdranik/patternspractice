package patterns.structural.facade;

public class HDD {

    void copyFromDVD(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("Copying");
        } else {
            System.out.println("Please, insert a disk");
        }
    }
}
