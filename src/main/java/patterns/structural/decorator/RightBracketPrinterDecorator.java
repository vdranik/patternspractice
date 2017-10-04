package patterns.structural.decorator;

public class RightBracketPrinterDecorator extends PrinterDecorator {

    public RightBracketPrinterDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(")");
    }
}
