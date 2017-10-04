package patterns.creational.builder;

public class Contact {

    private final String name;
    private final String surname;
    private final String mail;
    private final String address;

//    bad practice
//    public Contact(final String name, final String surname, final String mail, final String address) {
//        this.name = name;
//        this.surname = surname;
//        this.mail = mail;
//        this.address = address;
//    }

    private Contact(final ContactBuilder contactBuilder){
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.mail = contactBuilder.getMail();
        this.address = contactBuilder.getAddress();
    }

    public static class ContactBuilder {
        private String name;
        private String surname;
        private String mail;
        private String address;

        public ContactBuilder name(final String name){
            this.name=name;
            return this;
        }

        public ContactBuilder surname(final String surname){
            this.surname=surname;
            return this;
        }

        public ContactBuilder mail(final String mail){
            this.mail=mail;
            return this;
        }

        public ContactBuilder address(final String address){
            this.address=address;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getMail() {
            return mail;
        }

        public String getAddress() {
            return address;
        }

        public Contact build(){
            return new Contact(this);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contact{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
