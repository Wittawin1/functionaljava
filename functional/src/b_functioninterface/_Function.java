package b_functioninterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment =  inCrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer> addBy1andThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1andThenMultiplyBy10.apply(4)); //50



    }
    static Function<Integer,Integer> incrementByOneFunction =
            number -> number+1;

    static Function<Integer,Integer> multipleBy10Function =
            number -> number*10;
    static int inCrementByOne(int number){
        return  number+1;
    }
}
