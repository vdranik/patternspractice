package patterns.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {

        Printer printer = new SpecificPrinter("Hello");

        QuotesPrinterDecorator quotesPrinterDecorator =
                new QuotesPrinterDecorator(new LeftBracketPrinterDecorator(new RightBracketPrinterDecorator(printer)));

        quotesPrinterDecorator.print();

        quotesPrinterDecorator.newMethodFunctionalityFromQuotesPrinterDecorator();

    }
}
