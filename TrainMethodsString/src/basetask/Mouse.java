package basetask;

import java.sql.SQLOutput;

public class Mouse {


    public String name;
    public int age;

   public Mouse() {
        this.name = "Ben";
        this.age = 12;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет ");

    }
}
