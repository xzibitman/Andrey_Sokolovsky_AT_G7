package homework.day9.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public void eat(Insect food) {
        String vertebrataText = String.format("I am %s and I am eating %s", getClass(),food);
        System.out.println(vertebrataText);
    }
}
