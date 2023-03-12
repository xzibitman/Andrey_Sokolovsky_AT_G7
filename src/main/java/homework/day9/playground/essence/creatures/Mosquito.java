package homework.day9.playground.essence.creatures;

import homework.day9.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }
    public void fly(String direction) {
        System.out.printf("I am %s my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.name, direction);
    }
}
