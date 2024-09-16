package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        //Q:-convert first charecter to uppercase in a given string

        String dum= "my name is somen";

        String splitDum[] = dum.split(" ");
        String updatedDum = Arrays.stream(splitDum)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println("The update string is "+ updatedDum);


        //Q:- find 2nd highest element from the array
        int[] number = {2,56,23,5,8,22};

        Arrays.stream(number)
                .boxed()//convert to IntStream to Stream<Integer>
                .sorted((a,b)->b-a)
                .limit(2)
                .skip(1)
                .forEach(System.out::println);

        Integer secondHighestNumber = Arrays.stream(number)
                .boxed()//convert to IntStream to Stream<Integer>
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("2nd highest number is: "+secondHighestNumber);

        Comparator<String> newCom= Comparator.comparing(String::isBlank)
                .thenComparing(String::isEmpty);// this way we can create comparators

        //Q:- elements from array which starts with 2

        int[] num1= {12,22,34,24,45,28};
        List<Integer> startsWith2 = Arrays.stream(num1)
                .boxed()
                .filter(e -> String.valueOf(e).startsWith("2"))
                .collect(Collectors.toList());

        System.out.println("The numbers starting with two are: "+startsWith2);

        //Q:-find longest string from an array
        String[] names = {"somen","Rashmi","subhrakanta","sumeet"};

        String longestString = Arrays.stream(names)
                .max(Comparator.comparing(String::length))
                .get();

        //another way
        String alternateWay=Arrays.stream(names)
                        .reduce((x,y)->x.length()>y.length()?x:y).get();
        System.out.println("longest String is:- "+longestString);
        System.out.println("longest String is:- "+alternateWay);

        String secondLongest = Arrays.stream(names)
                .sorted(Comparator.comparing(String::length))
                .skip(1)
                .findFirst().get();

        System.out.println("second longest String is:- "+secondLongest);

        //Q:- find first non repeated charecter from a string
        String input = "gainjavaknowledge";

        LinkedHashMap<Character, Long> collect = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())); //Linked hashmap to store insertion order

        Arrays.stream(input.split(""));//alternate way to convert into stream
        System.out.println("the frequency of each character is:- "+collect);

        Character firstNonRepeated = collect.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println("First non repeated character is:"+firstNonRepeated);

        System.out.println(String.join("->","som","ram","tam"));

        //Q : how to merge two streams
        Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);

        Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
        System.out.println("resulting stream is:- "+ resultingStream.toList());
    }
}
