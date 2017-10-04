package patterns.structural.decorator;

public class LeftBracketPrinterDecorator extends PrinterDecorator{

    public LeftBracketPrinterDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("(");
        super.print();
    }
}
