package lekcja7;

public class Person {
    protected String name;
    protected String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getFullName() {
        return name + " " + surName;
    }

}
