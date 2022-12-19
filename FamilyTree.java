package HW1;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    private final List<Node> tree = new ArrayList<>();

    public List<Node> getTree() {
        return tree;
    }

}

class Person {

    private final String fullName;

    private final List<Person> family = new ArrayList<>();

    public List<Person> getFamily() {
        return family;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void appendToFamily(Person p) {
        family.add(p);
    }

    @Override
    public String toString() {
        return fullName;
    }
}
