package patterns.structural.decorator;

public class SpecificPrinter implements Printer {

    private String value;

    public SpecificPrinter(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
