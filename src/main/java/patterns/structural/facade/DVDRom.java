package patterns.structural.facade;

public class DVDRom {

    private boolean disk;

    public boolean hasData(){
        return disk;
    }

    void loadDisk(){
        System.out.println("Disk in PC");
        disk = true;
    }

    void unloadDisk(){
        System.out.println("Disk unload");
        disk = false;
    }
}
