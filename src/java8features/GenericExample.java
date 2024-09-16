package java8features;

public class GenericExample {

    public static void main(String[] args) {
        //by help of generics we an achieve type safety
        Box<String> name = new Box<>("somen");
        System.out.println(name.getContainer());

        Box<Integer> number = new Box<>(1122);
        System.out.println(number.getContainer());
    }
}
