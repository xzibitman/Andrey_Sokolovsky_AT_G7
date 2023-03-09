package homework.day9.playground.processors;


import homework.day9.playground.essence.craft.Transportable;
import homework.day9.playground.utils.CoordinatesGenerator;


public class TransportableProcessor {


    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int returnMove = transportable.move(pointA, pointB);
        System.out.printf(" Transportable %s was moved to %d points. ", getClass().getSimpleName(), returnMove);
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int destination = transportable.move(pointA, pointB);

        System.out.printf(" Transportable %s was moved to %d points. ", getClass().getSimpleName(), destination);

    }
}





