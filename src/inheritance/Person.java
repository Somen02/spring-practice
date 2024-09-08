package inheritance;

public class Person {

    int id;
    String name;

    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    public Person() {
        System.out.println("Person constructor");
    }
}
