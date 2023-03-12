package homework.day9.playground.processors;

import homework.day9.playground.essence.Flyable;
import homework.day9.playground.utils.DirectionGenerator;

public class FlyableProcessor extends DirectionGenerator implements Flyable {

    public void fly(String direction) {

    }

    public void runFlyable(Flyable flyable) {
        flyable.fly(DirectionGenerator.generateDirection());

    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);

    }

}
