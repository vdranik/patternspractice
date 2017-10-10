package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightApp {
    public static void main(String[] args) {

        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));

        //hiring only 2 times
        developers.forEach(developer -> developer.writeCode());
    }
}
