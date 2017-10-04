package patterns.creational.prototype;


//In Java we can use clone(), Cloneable,
public class PrototypeApp {

    public static void main(String[] args) {

        Human original = new Human(27, "Vasiliy");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory humanFactory = new HumanFactory(new Human(30,"Nikolay"));
        Human copy2 = humanFactory.makeCopy();
        System.out.println(copy2);
    }
}
