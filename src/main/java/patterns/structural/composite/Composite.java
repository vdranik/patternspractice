package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{

    private List<Shape> components = new ArrayList<>(); //it holds shapes and other composites

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        components.forEach(component -> component.draw());
    }
}
