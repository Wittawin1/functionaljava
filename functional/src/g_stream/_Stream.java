package g_stream;

import a_imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.Male),
                new Person("Maria", Gender.Female),
                new Person("Aisha", Gender.Female),
                new Person("Wick", Gender.Male),
                new Person("Laura", Gender.Female),
                new Person("Laura", Gender.PREFER_NOT_TO_SAY)

        );

        Function<Person,String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
              //.forEach(gender -> System.out.println(gender))
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.Female.equals(person.gender);
        boolean containOnlyFemales =people.stream()
//                .allMatch(person -> Gender.Female.equals(person.gender));
        .anyMatch(personPredicate);
        System.out.println(containOnlyFemales);

    }

        static class Person{
            private final String name;
            private final Gender gender;

            public Person(String name, Gender gender) {
                this.name = name;
                this.gender = gender;
            }

            @Override
            public String toString() {
                return "Person{name = "+name+"}"+","+"gender = "+gender;
            }
        }
        enum Gender{
            Male,Female,PREFER_NOT_TO_SAY
        };

}
