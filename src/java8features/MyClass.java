package java8features;

//default method in interfaces
//Static methods in interfaces
interface Parent{
   default void sayHello(){
        System.out.println("yes");
    }
    static void sayBye(){
        System.out.println("BYE");
    }
}

class Child implements Parent{

    @Override
    public void sayHello(){
        System.out.println("child says yes" );
        Parent.super.sayHello();
    }
}

public class MyClass {
    public static void main (String args[]){

        Parent c= new Child();
        c.sayHello();
        Parent.sayBye();
    }
}
