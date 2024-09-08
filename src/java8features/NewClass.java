package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class NewClass {

    public static void main(String[] args) {
        Predicate<Integer> pred = x -> x % 2 == 0;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(int i: list){
            if(pred.test(i)){
                System.out.println(i);
            }
        }
        Predicate<String> pred2 = x->x.toLowerCase().charAt(0)=='a';
        Predicate<String> pred3 = x->x.toLowerCase().charAt(x.length()-1)=='l';
        Predicate<String> pred2AndPred3 = pred2.and(pred3);

        System.out.println(pred2AndPred3.test("amal"));
        System.out.println(pred2.negate().test("amal"));

        System.out.println(pred2.test("amal"));

        Function<String,Integer> function = x->x.length();
        System.out.println(function.apply("somen"));

        int[] ar= {1,2,3,0,0,0};

        int[] ar2={2,5,6};

        int[] pr= new int[3];
        int[] pr2= new int[3];


        for(int i=0;i<3;i++){
            pr[i]=ar[i];
        }
        for(int j=0;j<3;j++){
            pr2[j]=ar2[j];
        }
        ar = IntStream.concat(Arrays.stream(pr),Arrays.stream(pr2)).sorted().toArray();

        System.out.println(Arrays.toString(ar));
    }
}
