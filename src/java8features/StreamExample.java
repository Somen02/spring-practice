package java8features;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int[] ar = {1,2,3,2,4,5,6,6,5,7};

        int sum = Arrays.stream(ar).filter(n->n%2==0).sum();

        List<Integer> list = Arrays.asList(1,3,23,31,5,5,3,6,9,2,34);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = Stream.of(1, 3, 4, 2, 5);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(10);

        Stream<String> stringStream = Stream.generate(() -> "hello").limit(5);

//        System.out.println(sum);
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->b-a)
                .limit(3) //tries to limit the num of values
                .skip(1) // will skip from beg the req num of values
                .collect(Collectors.toList());
//        System.out.println(collect);


        Integer i = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println) //use to print the elements
                .max((a, b) ->  b-a).get();
        System.out.println(i);

        //Find the sum of all elements using a stream
        List<Integer> li =Arrays.asList(1,5,2,3,45,3,1,4);
        int sum1 = li.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //Find the maximum element using streams
//        Integer max = li.stream().max((a, b) -> a - b).get();
        Integer max = li.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        //count number of strings that starts with specific charecters.
        List<String> fruit = Arrays.asList("apple","guava","mango","cherry","coconut");
        long c = fruit.stream().filter(s -> s.startsWith("c")).count();
        System.out.println(c);

        //average of list of floating points using streams
        List<Double> nums = Arrays.asList(1.2,2.4,3.11,5.6);
//        nums.toArray();
        double avgDouble = nums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avgDouble);

        //concatinate all the strings
        String concatFruits = fruit.stream().collect(Collectors.joining("+"));
        System.out.println(concatFruits);

        //Given a sentence find and print the frequency of words.
        String sentence = "Java is a programming language . java is a versatile language";
        Map<String, Long> collect1 = Arrays.stream(sentence.split("\\s")).collect(Collectors.groupingBy(e->e ,Collectors.counting()));
        System.out.println(collect1);

        //print duplicate numbers of an array if it contains multiple duplicates.

        Arrays.stream(ar)
                .boxed()//to convert to integer stream
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);


        int[] ar2 = {9,10,11,12,32,8};
        int[] array = IntStream.concat(Arrays.stream(ar), Arrays.stream(ar2)).sorted().toArray();
        System.out.println(Arrays.toString(array));


        String name="somen sem";
        Map<Character, Long> collect2 = name.chars().mapToObj(ac -> (char) ac)
                .filter(e -> !Character.isWhitespace(e))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        IntSummaryStatistics intSummaryStatistics = li.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics);

        int number = 1234;
        int sum2 = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println(sum2);

        String collect3 = name.chars()
//                .sorted()
                .mapToObj(ac -> (char) ac)
                .filter(e -> !Character.isWhitespace(e))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect3);

        System.out.println(100+100+"java");
        System.out.println("java"+100+100);
    }



}
