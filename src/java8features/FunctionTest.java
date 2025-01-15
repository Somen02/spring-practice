package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<String,String> function = x->x.substring(0,3);
        Function<List<Student>,List<Student>> studentStartWithSom = x ->{
          List<Student> result = new ArrayList<>();
          for(Student s : x){
              if(function.apply(s.getName()).equalsIgnoreCase("som")){
                  result.add(s);
              }
          }
            return result;
        };
        Student somen = new Student(1, "somen");
        Student ram = new Student(2, "Ram");
        Student somya = new Student(1, "somya");
        
        List<Student> students = Arrays.asList(somen,ram,somya);
        List<Student> result = studentStartWithSom.apply(students);
        System.out.println(result);

        Function<Integer,Integer> function1 = x->x*2;
        Function<Integer,Integer> function2 = x->x*x*x;

        System.out.println(function1.andThen(function2).apply(5));
        System.out.println(function1.compose(function2).apply(5));


    }

    private static class Student{
        private int roll;
        private String name;

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
