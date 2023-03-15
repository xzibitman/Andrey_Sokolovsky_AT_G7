package homework.day15;


import homework.day9.playground.essence.craft.air.Copter;
import homework.day9.playground.essence.craft.air.Plane;
import homework.day9.playground.essence.craft.air.Rocket;
import homework.day9.playground.essence.craft.field.Car;
import homework.day9.playground.essence.craft.field.Moped;
import homework.day9.playground.essence.craft.field.Motorbike;
import homework.day9.playground.essence.craft.hand.Bottle;
import homework.day9.playground.essence.craft.hand.Can;
import homework.day9.playground.essence.craft.hand.Mug;
import homework.day9.playground.essence.creatures.*;


public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> stringString = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDouble = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterPlane = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> planeRocket = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Car> rocketCar = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Moped> carMoped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> mopedMotorbike = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Bottle> motorbikeBottle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCan = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Can, Mug> canMug = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Beetle> mugBeetle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Carrot> beetleCarrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrotChamomile = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Crocodile> chamomileCrocodile = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flowers> crocodileFlowers = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Flowers, Fly> flowersFly = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Maylily> flyMaylily = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> maylilyMosquito = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Pigeon> mosquitoPigeon = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> pigeonPotato = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Radish> potatoRadish = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRaven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Rose> ravenRose = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Vegetable> roseVegetable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Copter> vegetableCopter = new GenericMethodsInGenericClassTwoParams<>();

        Copter copter = new Copter(2, "copterGen");
        Plane plane = new Plane(2, "planeGen");
        Rocket rocket = new Rocket(2, "rocketGen");
        Car car = new Car(2, "carGen");
        Moped moped = new Moped(2, "mopedGen");
        Motorbike motorbike = new Motorbike(2, "motorbikeGen");
        Bottle bottle = new Bottle(2, "bottleGen");
        Can can = new Can(2, "canGen");
        Mug mug = new Mug(2, "mugGen");
        Beetle beetle = new Beetle(2, "beetleGen");
        Carrot carrot = new Carrot(2, "carrotGen");
        Chamomile chamomile = new Chamomile(2, "chamomileGen");
        Crocodile crocodile = new Crocodile(2, "crocodileGen");
        Flowers flowers = new Flowers(2, "flowersGen");
        Fly fly = new Fly(2, "flyGen");
        Maylily maylily = new Maylily(2, "maylilyGen");
        Mosquito mosquito = new Mosquito(2, "mosquitoGen");
        Pigeon pigeon = new Pigeon(2, "pigeonGen");
        Potato potato = new Potato(2, "potatoGen");
        Radish radish = new Radish(2, "radishGen");
        Raven raven = new Raven(2, "ravenGen");
        Rose rose = new Rose(2, "roseGen");
        Vegetable vegetable = new Vegetable(2, "vegetableGen");

        System.out.println(stringString.genericMethodGenArgs("first arg", "second arg"));
        System.out.println(stringInteger.genericMethodGenArgs("third arg", 1));
        System.out.println(stringDouble.genericMethodGenArgs("string with double", 23.2));
        System.out.println(integerInteger.genericMethodGenArgs(2, 54));
        System.out.println(copterPlane.genericMethodGenArgs(copter, plane));
        System.out.println(planeRocket.genericMethodGenArgs(plane, rocket));
        System.out.println(rocketCar.genericMethodGenArgs(rocket, car));
        System.out.println(carMoped.genericMethodGenArgs(car, moped));
        System.out.println(mopedMotorbike.genericMethodGenArgs(moped, motorbike));
        System.out.println(motorbikeBottle.genericMethodGenArgs(motorbike, bottle));
        System.out.println(bottleCan.genericMethodGenArgs(bottle, can));
        System.out.println(canMug.genericMethodGenArgs(can, mug));
        System.out.println(mugBeetle.genericMethodGenArgs(mug, beetle));
        System.out.println(beetleCarrot.genericMethodGenArgs(beetle, carrot));
        System.out.println(carrotChamomile.genericMethodGenArgs(carrot, chamomile));
        System.out.println(chamomileCrocodile.genericMethodGenArgs(chamomile, crocodile));
        System.out.println(crocodileFlowers.genericMethodGenArgs(crocodile, flowers));
        System.out.println(flowersFly.genericMethodGenArgs(flowers, fly));
        System.out.println(flyMaylily.genericMethodGenArgs(fly, maylily));
        System.out.println(maylilyMosquito.genericMethodGenArgs(maylily, mosquito));
        System.out.println(mosquitoPigeon.genericMethodGenArgs(mosquito, pigeon));
        System.out.println(pigeonPotato.genericMethodGenArgs(pigeon, potato));
        System.out.println(potatoRadish.genericMethodGenArgs(potato, radish));
        System.out.println(radishRaven.genericMethodGenArgs(radish, raven));
        System.out.println(ravenRose.genericMethodGenArgs(raven, rose));
        System.out.println(roseVegetable.genericMethodGenArgs(rose, vegetable));
        System.out.println(vegetableCopter.genericMethodGenArgs(vegetable, copter));


        stringString.genericMethodHalfGenArgs("strings gen", "with two strings");
        stringInteger.genericMethodHalfGenArgs("string with integer", String.valueOf(99));
        stringDouble.genericMethodHalfGenArgs("string with double", String.valueOf(23.2));
        integerInteger.genericMethodHalfGenArgs(45, "integer");
        copterPlane.genericMethodHalfGenArgs(copter, "plane");
        planeRocket.genericMethodHalfGenArgs(plane, "rocket");
        rocketCar.genericMethodHalfGenArgs(rocket, "car");
        carMoped.genericMethodHalfGenArgs(car, "moped");
        mopedMotorbike.genericMethodHalfGenArgs(moped, "motorbike");
        motorbikeBottle.genericMethodHalfGenArgs(motorbike, "bottle");
        bottleCan.genericMethodHalfGenArgs(bottle, "can");
        canMug.genericMethodHalfGenArgs(can, "mug");
        mugBeetle.genericMethodHalfGenArgs(mug, "beetle");
        beetleCarrot.genericMethodHalfGenArgs(beetle, "carrot");
        carrotChamomile.genericMethodHalfGenArgs(carrot, "chamomile");
        chamomileCrocodile.genericMethodHalfGenArgs(chamomile, "crocodile");
        crocodileFlowers.genericMethodHalfGenArgs(crocodile, "flowers");
        flowersFly.genericMethodHalfGenArgs(flowers, "fly");
        flyMaylily.genericMethodHalfGenArgs(fly, "maylily");
        maylilyMosquito.genericMethodHalfGenArgs(maylily, "mosquito");
        mosquitoPigeon.genericMethodHalfGenArgs(mosquito, "pigeon");
        pigeonPotato.genericMethodHalfGenArgs(pigeon, "potato");
        potatoRadish.genericMethodHalfGenArgs(potato, "radish");
        radishRaven.genericMethodHalfGenArgs(radish, "raven");
        ravenRose.genericMethodHalfGenArgs(raven, "rose");
        roseVegetable.genericMethodHalfGenArgs(rose, "vegetable");
        vegetableCopter.genericMethodHalfGenArgs(vegetable, "copter");

        stringString.genericMethodHalfGenArgs("strings gen", "with two strings and text", "empty text");
        stringInteger.genericMethodHalfGenArgs("string with integer", 63, "string plus integer plus text");
        stringDouble.genericMethodHalfGenArgs("string with double", 23.2, "string plus double");
        integerInteger.genericMethodHalfGenArgs(45, 88, "integers and text");
        copterPlane.genericMethodHalfGenArgs(copter, plane, "plane");
        planeRocket.genericMethodHalfGenArgs(plane, rocket, "rocket");
        rocketCar.genericMethodHalfGenArgs(rocket, car, "car");
        carMoped.genericMethodHalfGenArgs(car, moped, "moped");
        mopedMotorbike.genericMethodHalfGenArgs(moped, motorbike, "motorbike");
        motorbikeBottle.genericMethodHalfGenArgs(motorbike, bottle, "bottle");
        bottleCan.genericMethodHalfGenArgs(bottle, can, "can");
        canMug.genericMethodHalfGenArgs(can, mug, "mug");
        mugBeetle.genericMethodHalfGenArgs(mug, beetle, "beetle");
        beetleCarrot.genericMethodHalfGenArgs(beetle, carrot, "carrot");
        carrotChamomile.genericMethodHalfGenArgs(carrot, chamomile, "chamomile");
        chamomileCrocodile.genericMethodHalfGenArgs(chamomile, crocodile, "crocodile");
        crocodileFlowers.genericMethodHalfGenArgs(crocodile, flowers, "flowers");
        flowersFly.genericMethodHalfGenArgs(flowers, fly, "fly");
        flyMaylily.genericMethodHalfGenArgs(fly, maylily, "maylily");
        maylilyMosquito.genericMethodHalfGenArgs(maylily, mosquito, "mosquito");
        mosquitoPigeon.genericMethodHalfGenArgs(mosquito, pigeon, "pigeon");
        pigeonPotato.genericMethodHalfGenArgs(pigeon, potato, "potato");
        potatoRadish.genericMethodHalfGenArgs(potato, radish, "radish");
        radishRaven.genericMethodHalfGenArgs(radish, raven, "raven");
        ravenRose.genericMethodHalfGenArgs(raven, rose, "rose");
        roseVegetable.genericMethodHalfGenArgs(rose, vegetable, "vegetable");
        vegetableCopter.genericMethodHalfGenArgs(vegetable, copter, "copter");
    }
}
