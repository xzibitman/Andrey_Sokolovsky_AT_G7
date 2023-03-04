package homework.day9.playground.essence.craft.air;

import homework.day9.playground.essence.Flyable;
import homework.day9.playground.essence.Matter;
import homework.day9.playground.essence.craft.Transportable;


public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;
    int pointA;
    int pointB;

    public void flyable() {

    }

    public void transportable() {

    }


    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), this.name, pointA, pointB);
        return pointB - pointA;
    }
}




