package main.java.homeWorks.module_5.person;

public class Person {

    private String name;
    private String surname;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.email = email;
        this.surname = surname;
    }

    public static void printPersonInfo(Person person) {
        System.out.printf("First name: %s Surname: %s E-mail: %s \n", person.getName(), person.getSurname(), person.getEmail());
    }
}
