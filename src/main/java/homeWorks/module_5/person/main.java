package main.java.homeWorks.module_5.person;

public class main {
    public static void main(String[] args) {
        Person vasili = new Person();
        vasili.setName("Vasili");
        vasili.setEmail("vasilii@gmail.com");
        vasili.setSurname("Vasechkin");

        Person petro = new Person("Petro", "Petrov", "petro@gmail.com");

        Person.printPersonInfo(vasili);
        Person.printPersonInfo(petro);
    }
}
