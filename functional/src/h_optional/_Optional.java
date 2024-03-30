package h_optional;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {


        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Default value");
        System.out.println(value);

        Supplier<IllegalStateException> exception =
                () -> new IllegalStateException("exception");
        Object valuee = Optional.ofNullable(null)
                .orElseThrow(exception);
        System.out.println(valuee);

        Optional.ofNullable("Hello")
                .ifPresent(valuep -> {
                    // logic
                    System.out.println(valuep);
        });


        Optional.ofNullable("Hello")
                .ifPresentOrElse(
                        valuepe -> System.out.println(valuepe) ,
                            () ->
                        System.out.println("Can not send mail"));

    }
}
