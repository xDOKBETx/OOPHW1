package HW1;

public record Node(Person person1, HW1.Node.Relationship relation, Person person2) {

    enum Relationship {
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relation, person2);
    }

}
