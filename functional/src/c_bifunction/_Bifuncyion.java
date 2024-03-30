package c_bifunction;

import java.util.function.BiFunction;

public class _Bifuncyion {
        public static void main(String[] args) {


//            int increment2 = incrementByOneFunction.apply(1);
//            System.out.println(increment2);
//
//            int multiply = multipleBy10Function.apply(increment2);
//            System.out.println(multiply);
//
//            Function<Integer,Integer> addBy1andThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
//            System.out.println(addBy1andThenMultiplyBy10.apply(4)); //50

            int x = inCrementByOneAndMultiply(4,100);
            System.out.println(x);
            int x2 = inCrementByOneAndMultiplyBiFunction.apply(4,100);
            System.out.println(x2);


        }
//        static Function<Integer,Integer> incrementByOneFunction =
//                number -> number+1;
//
//        static Function<Integer,Integer> multipleBy10Function =
//                number -> number*10;

        static int inCrementByOneAndMultiply(int number,int numToMultiply){
             return  (number+1)*numToMultiply;}
        static BiFunction<Integer,Integer,Integer> inCrementByOneAndMultiplyBiFunction =
                (numberToIncremenByOne , numberToMultiplyBy) ->
                        ((numberToIncremenByOne + 1)*numberToMultiplyBy);}


