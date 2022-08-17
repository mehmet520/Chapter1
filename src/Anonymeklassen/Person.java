package Anonymeklassen;

public class Person {

    //Eigenschaften
    private String name;

    public Person(String name) {
        this.name = name;
        printName();
    }

    public String getName() {
        return name;
    }

    //Methoden
    public void printName() {
        System.out.println(name);
    }
}
