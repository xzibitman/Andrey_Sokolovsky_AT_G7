package homework.day9.playground.utils;

public class DistanceGenerator {
    public static int generateDistance() {
        int X = 1 + (int) (Math.random() * 99);
        System.out.println("DistanceGenerator: I have generated distance with value: " + X);
        return X;
    }

}
