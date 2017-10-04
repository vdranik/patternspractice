package patterns.creational.prototype;

public class Human implements Copyable{

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        Human copyHuman = new Human(age,name);
        return copyHuman;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
