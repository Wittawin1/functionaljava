package i_finalclass;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {

        Function<String,String> printName = name -> name;
        Function<String,String> upperCaseName = name -> name.toUpperCase();
        Function<String,String> upperCaseNamef = name -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException();
            return name.toUpperCase();
        };
        BiFunction<String,Integer,String> upperCaseNamebi = (name, age) -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseNamebi.apply("Alex",20));
    }
}
