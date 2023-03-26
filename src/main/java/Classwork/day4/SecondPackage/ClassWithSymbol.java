package Classwork.day4.SecondPackage;

import Classwork.day5.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassWithSymbol {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(list.stream().flatMap(x->Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo).get());
        System.out.println(persons.stream().min(Comparator.comparingInt(x->x.age)).get());
    }
}



