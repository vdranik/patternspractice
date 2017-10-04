package patterns.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;

    //2 Double Checked Locking & volatile
    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}
