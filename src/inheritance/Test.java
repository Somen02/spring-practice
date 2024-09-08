package inheritance;

class Base {
    static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }
}

class Derived extends Base {
    static void display() {
        System.out.println("Static or class method from Derived");
    }

    public void print() {
        System.out.println("Non-static or instance method from Derived");
    }
}

public class Test {
    public static void main(String args[]) {
        Base obj = new Derived();
        Base obj1 = new Base();
        Derived obj2=new Derived();
        obj2.display();
        obj.display();
        obj.print();
    }
}