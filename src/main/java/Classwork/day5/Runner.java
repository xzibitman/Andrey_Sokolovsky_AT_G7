package Classwork.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Runner {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        int counter = 0;
        for (Person ages : persons) {
            if (ages.age >= 18 && ages.age < 55 && ages.sex == Person.Sex.WOMEN) {
                counter++;
            }
        }
        System.out.println("Работающих женщин " + counter);
        int counter2 = 0;
        for (Person ages : persons) {
            if (ages.age >= 18 && ages.age < 60 && ages.sex == Person.Sex.MAN) {
                counter2++;
            }
        }
        System.out.println("Работающих мужчин " + counter2);
        System.out.println(persons.stream().filter(person -> person.age >= 18 && person.age < 55 && person.sex == Person.Sex.WOMEN).count());
        System.out.println(persons.stream().filter(person -> person.age >= 18 && person.age < 60 && person.sex == Person.Sex.MAN).count());
    }
}


