package patterns.structural.adapter;

public class AdapterApp {
    public static void main(String[] args) {

        Database database = new AdapterJavaToDB();

        database.insert();
        database.get();
        database.update();
        database.remove();
    }
}
