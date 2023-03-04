package homework.day9.playground.essence.craft.field;

import homework.day9.playground.essence.Matter;
import homework.day9.playground.essence.craft.Rideable;
import homework.day9.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;
    int pointA;
    int pointB;

    public void transportable() {

    }

    public void rideable() {

    }

    public Vehicle(int mass, String name) {
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
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), this.name, this.pointA, this.pointB);
        return pointB - pointA;
    }
}
