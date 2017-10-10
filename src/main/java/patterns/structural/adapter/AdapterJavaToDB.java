package patterns.structural.adapter;

public class AdapterJavaToDB extends JavaOtherClass implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void get() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
