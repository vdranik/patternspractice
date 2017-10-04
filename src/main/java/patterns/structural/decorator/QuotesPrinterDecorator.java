package patterns.structural.decorator;

public class QuotesPrinterDecorator extends PrinterDecorator{

    public QuotesPrinterDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }

    public void newMethodFunctionalityFromQuotesPrinterDecorator(){
        System.out.println("\nCall new method from QuotesPrinterDecorator");
    }
}
