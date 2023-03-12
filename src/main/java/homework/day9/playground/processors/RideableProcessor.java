package homework.day9.playground.processors;

import homework.day9.playground.essence.craft.Rideable;
import homework.day9.playground.utils.DirectionGenerator;

public class RideableProcessor implements Rideable {


    public void drive(String direction) {

    }

    public void runRideable(Rideable rideable) {
        String direction = DirectionGenerator.generateDirection();
        rideable.drive(direction);
    }
    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }


}
