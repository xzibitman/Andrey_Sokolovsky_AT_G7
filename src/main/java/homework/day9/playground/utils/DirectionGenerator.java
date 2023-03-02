package homework.day9.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        String direction = "direction name";
        int min = 1;
        int max = 40;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        if (i > 1 && i < 9) {
            direction = "NORTH";
        }
        if (i > 10 && i < 19) {
            direction = "SOUTH";
        }
        if (i > 20 && i < 29) {
            direction = "WEST";
        }
        if (i > 30 && i > 39) {
            direction = "EAST";
        }
        return direction;

    }
}
