package homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects newObj = new TrainMethodsObjects();

        Mouse mouse = new Mouse();
        newObj.processMouse(mouse);
        Souce souce = new Souce();
        newObj.processSouce(souce);
        Bee bee = new Bee();
        newObj.processBee(bee);
        Obstacle obstacle = new Obstacle();
        newObj.processObstacle(obstacle);
        Pineapple pineapple = new Pineapple();
        newObj.processPineapple(pineapple);


    }
}
