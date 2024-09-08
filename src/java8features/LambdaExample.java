package java8features;

import java.util.*;

//functional interface and lambdaexpression
public class LambdaExample {
    public static void main(String[] args) {
        Dummy dum = () -> "Somen";
        System.out.println("name is " + dum.getName());
        

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello" + i);
            }
        };
        Thread childThread = new Thread(runnable);
        childThread.run();


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        numbers.add(2);
        numbers.add(10);
        numbers.add(8);
        numbers.add(12);
        numbers.add(6);

        Collections.sort(numbers, (a, b) -> b - a);//descending order sorting using comparator
        System.out.println(numbers);


        Set<Integer> ss = new TreeSet<>((a,b)->b-a);// tree set allows directly adding comparator in constructor
        ss.add(2);
        ss.add(22);
        ss.add(12);
        System.out.println(ss);



    }
}
