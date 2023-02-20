package homework.day2.basetask;


public class Mouse {


    private String name;
    private int age;

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
