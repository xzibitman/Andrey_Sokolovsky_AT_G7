package Classwork.day4.SecondPackage;

import Classwork.day5.Person;

import java.util.Arrays;
import java.util.List;

public class SumOfSymbol {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(list.stream().reduce((x,y)->x+y).get());
//        System.out.println(persons.stream().map(String::length).reduce((x,y)->x+y).get());
    }
}
