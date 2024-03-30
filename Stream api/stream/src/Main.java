import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,8,9);
//        Stream<Integer> data = nums.stream()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));


         nums.stream()
                 .filter(n -> n % 2 == 1)
                 .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

         int result = nums.stream()
                 .filter(n -> n % 2 == 1)
                 .sorted()
                 .map(n -> n*2)
                 .reduce(0,(c,e) -> c+e);

        int results = nums.parallelStream()
                .filter(n -> n % 2 == 1)
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e);

//        long count = data.count();
//        System.out.println(count);

//        Stream<Integer> sorteddata = data.sorted(); //new stream
////        data.forEach(n -> System.out.println(n)); error cuz steam can call 1 time
//        sorteddata.forEach(n -> System.out.println(n));

//        Stream mappedData =  data.map(n -> n*2);
//        mappedData.forEach(n -> System.out.println(n));



//        for (int n : nums){
//            System.out.println(n*2);
//        }
    }
}