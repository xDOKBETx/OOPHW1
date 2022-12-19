package HW1;

public class Main {
    public static void main(String[] args) {

        Person dad = new Person("Николай");
        Person mom = new Person("Надежда");
        Person the_eldest_son = new Person("Андрей");
        Person daughter = new Person("Елена");
        Person the_youngest_son = new Person("Алексей");
        Person the_eldest_granddaughter = new Person("Анна");
        Person the_youngest_granddaughter = new Person("Ксения");
        Person grandson = new Person("Богдан");

        dad.appendToFamily(mom);
        mom.appendToFamily(the_eldest_son);
        mom.appendToFamily(daughter);
        mom.appendToFamily(the_youngest_son);
        the_eldest_son.appendToFamily(the_eldest_granddaughter);
        the_eldest_son.appendToFamily(grandson);
        daughter.appendToFamily(the_youngest_granddaughter);

        research(dad, "");
    }

    static void research(Person root, String sp) {
        if (root != null) {
            Printer.outputData(sp + root);
            for (Person item : root.getFamily()) {
                research(item, sp + "  ");
            }
        }
    }
    public static class Printer {

        public static void outputData(String data) {
            System.out.println(data);
        }
    }
}
