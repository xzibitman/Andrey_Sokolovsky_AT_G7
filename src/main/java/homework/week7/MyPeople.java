package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class MyPeople {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));
        for (Person number : people) {
            System.out.print(number.getAge() + " ");
        }
        System.out.println(" ");
        for (Person text : people) {
            System.out.print(text.getName() + " ");
        }
        for (int i = 0; i < people.size(); i++) {
            System.out.print("\n" + people.get(i).toString());
        }
    }
}
