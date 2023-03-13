package homework.day15;

import homework.day9.playground.essence.craft.air.Aircraft;
import homework.day9.playground.essence.craft.air.Copter;
import homework.day9.playground.essence.craft.air.Plane;
import homework.day9.playground.essence.craft.air.Rocket;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<Integer> integerGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<String> stringGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> aircraftGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGen = new GenericMethodsInGenericClassT();
        GenericMethodsInGenericClassT<Plane> planeGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGen = new GenericMethodsInGenericClassT<>();
    }
}
