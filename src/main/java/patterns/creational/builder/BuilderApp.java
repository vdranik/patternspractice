package patterns.creational.builder;

public class BuilderApp {
    public static void main(String[] args) {

        //wrong parameter's order, bad practice
        //Contact contact = new Contact("SURNAME","NAME", "ADDRESS", "EMAIL");

        final Contact contact = new Contact.ContactBuilder()
                .name("Volodymyr")
                .surname("Dranyk")
                .address("Kyiv, Ukraine")
                .mail("v.dranik@gmail.com")
                .build();

        System.out.println(contact);
    }
}
