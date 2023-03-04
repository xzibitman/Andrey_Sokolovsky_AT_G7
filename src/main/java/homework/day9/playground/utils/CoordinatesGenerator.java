package homework.day9.playground.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int X = 1 + (int) (Math.random() * 79);
        System.out.println("CoordinatesGenerator: I have generated point with value:" + X);
        return X;
    }
}
