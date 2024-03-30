package a_imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
              new Person("John", Gender.Male),
              new Person("Maria", Gender.Female),
              new Person("Aisha", Gender.Female),
              new Person("Wick", Gender.Male),
              new Person("Laura", Gender.Female)

        );

        //IMPERATIVE APPROACH
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (Gender.Female.equals((person.gender))){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        //Declarative Approach
        //1
        people.stream().filter(person -> Gender.Female.equals((person.gender)))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //2
        Predicate<Person> personPredicate = person -> Gender.Female.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(person -> Gender.Female
                        .equals((person.gender)))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

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
        Male,Female
    };
}


