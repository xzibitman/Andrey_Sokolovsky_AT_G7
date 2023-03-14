package homework.day15;

import homework.day9.playground.essence.Flyable;
import homework.day9.playground.essence.Matter;
import homework.day9.playground.essence.craft.Rideable;
import homework.day9.playground.essence.craft.Transportable;
import homework.day9.playground.essence.craft.air.Aircraft;
import homework.day9.playground.essence.craft.air.Copter;
import homework.day9.playground.essence.craft.air.Plane;
import homework.day9.playground.essence.craft.air.Rocket;
import homework.day9.playground.essence.craft.field.Car;
import homework.day9.playground.essence.craft.field.Moped;
import homework.day9.playground.essence.craft.field.Motorbike;
import homework.day9.playground.essence.craft.field.Vehicle;
import homework.day9.playground.essence.craft.hand.*;
import homework.day9.playground.essence.creatures.*;
import homework.day9.playground.essence.material.*;


public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<Integer> integerGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<String> stringGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> aircraftGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGen = new GenericMethodsInGenericClassT();
        GenericMethodsInGenericClassT<Plane> planeGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicleGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> containerGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Animal> animalGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flowers> flowersGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> insectGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> plantGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> vegetableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> vertebrataGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> matterGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rideable> rideableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Transportable> transportableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crawlable> crawlableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flyable> flyableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pourable> pourableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Powerable> powerableGen = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Storable> storableGen = new GenericMethodsInGenericClassT<>();

        Aircraft aircraft = new Aircraft(1, "aircraftGen") {
            @Override
            public void fly(String direction) {

            }
        };
        Copter copter = new Copter(1, "copterGen");
        Plane plane = new Plane(1, "planeGen");
        Rocket rocket = new Rocket(1, "rocketGen");
        Car car = new Car(1, "carGen");
        Moped moped = new Moped(1, "mopedGen");
        Motorbike motorbike = new Motorbike(1, "motorbikeGen");
        Vehicle vehicle = new Vehicle(1, "vehicleGen") {
        };
        Bottle bottle = new Bottle(1, "bottleGen");
        Can can = new Can(1, "canGen");
        Container container = new Container(1, "containerGen") {
        };
        Mug mug = new Mug(1, "mugGen");
        Storable storable = new Storable() {
        };
        Rideable rideable = new Rideable() {
            @Override
            public void drive(String direction) {
            }
        };
        Transportable transportable = new Transportable() {
            @Override
            public int move(int pointA, int pointB) {
                return 0;
            }
        };
        Animal animal = new Animal(1, "animalGen") {
        };
        Beetle beetle = new Beetle(1, "beetleGen");
        Carrot carrot = new Carrot(1, "carrotGen");
        Chamomile chamomile = new Chamomile(1, "chamomileGen");
        Crawlable crawlable = new Crawlable() {
            @Override
            public void crawl(String direction, int distance) {

            }

            @Override
            public void crawl(String direction) {

            }
        };
        Crocodile crocodile = new Crocodile(1, "crocodileGen");
        Flowers flowers = new Flowers(1, "flowersGen");
        Fly fly = new Fly(1, "flyGen");
        Insect insect = new Insect(1, "insectGen") {
        };
        Maylily maylily = new Maylily(1, "maylilyGen");
        Mosquito mosquito = new Mosquito(1, "mosquito");
        Pigeon pigeon = new Pigeon(1, "pigeonGen");
        Plant plant = new Plant(1, "plantGen") {
        };
        Potato potato = new Potato(1, "potatoGen");
        Radish radish = new Radish(1, "radishGen");
        Raven raven = new Raven(1, "ravenGen");
        Rose rose = new Rose(1, "roseGen");
        Vegetable vegetable = new Vegetable(1, "vegetableGen");
        Vertebrata vertebrata = new Vertebrata(1, "vertebrataGen") {
        };
        Diesel diesel = new Diesel();
        Petrol petrol = new Petrol();
        Water water = new Water();
        Pourable pourable = new Pourable() {
        };
        Powerable powerable = new Powerable() {
        };
        Flyable flyable = new Flyable() {
            @Override
            public void fly(String direction) {

            }
        };
        Matter matter = new Matter(1) {
        };

        integerGen.genericMethodOneGenArg(3);
        stringGen.genericMethodOneGenArg("it's a string");
        doubleGen.genericMethodOneGenArg(21.2);
        aircraftGen.genericMethodOneGenArg(aircraft);
        copterGen.genericMethodOneGenArg(copter);
        planeGen.genericMethodOneGenArg(plane);
        rocketGen.genericMethodOneGenArg(rocket);
        carGen.genericMethodOneGenArg(car);
        mopedGen.genericMethodOneGenArg(moped);
        motorbikeGen.genericMethodOneGenArg(motorbike);
        vehicleGen.genericMethodOneGenArg(vehicle);
        rideableGen.genericMethodOneGenArg(rideable);
        transportableGen.genericMethodOneGenArg(transportable);
        animalGen.genericMethodOneGenArg(animal);
        beetleGen.genericMethodOneGenArg(beetle);
        carrotGen.genericMethodOneGenArg(carrot);
        chamomileGen.genericMethodOneGenArg(chamomile);
        crawlableGen.genericMethodOneGenArg(crawlable);
        crocodileGen.genericMethodOneGenArg(crocodile);
        flowersGen.genericMethodOneGenArg(flowers);
        flyGen.genericMethodOneGenArg(fly);
        maylilyGen.genericMethodOneGenArg(maylily);
        mosquitoGen.genericMethodOneGenArg(mosquito);
        pigeonGen.genericMethodOneGenArg(pigeon);
        plantGen.genericMethodOneGenArg(plant);
        potatoGen.genericMethodOneGenArg(potato);
        radishGen.genericMethodOneGenArg(radish);
        ravenGen.genericMethodOneGenArg(raven);
        roseGen.genericMethodOneGenArg(rose);
        vegetableGen.genericMethodOneGenArg(vegetable);
        vertebrataGen.genericMethodOneGenArg(vertebrata);
        flyableGen.genericMethodOneGenArg(flyable);
        matterGen.genericMethodOneGenArg(matter);
        dieselGen.genericMethodOneGenArg(diesel);
        petrolGen.genericMethodOneGenArg(petrol);
        waterGen.genericMethodOneGenArg(water);
        pourableGen.genericMethodOneGenArg(pourable);
        powerableGen.genericMethodOneGenArg(powerable);
        bottleGen.genericMethodOneGenArg(bottle);
        canGen.genericMethodOneGenArg(can);
        containerGen.genericMethodOneGenArg(container);
        mugGen.genericMethodOneGenArg(mug);
        storableGen.genericMethodOneGenArg(storable);

        System.out.println(integerGen.genericMethodTwoGenArgs(22, 33));
        System.out.println(stringGen.genericMethodTwoGenArgs("first arg string", "second arg string"));
        System.out.println(doubleGen.genericMethodTwoGenArgs(12.2, 23.1));
        System.out.println(aircraftGen.genericMethodTwoGenArgs(aircraft, aircraft));
        System.out.println(copterGen.genericMethodTwoGenArgs(copter, copter));
        System.out.println(planeGen.genericMethodTwoGenArgs(plane, plane));
        System.out.println(rocketGen.genericMethodTwoGenArgs(rocket, rocket));
        System.out.println(carGen.genericMethodTwoGenArgs(car, car));
        System.out.println(mopedGen.genericMethodTwoGenArgs(moped, moped));
        System.out.println(motorbikeGen.genericMethodTwoGenArgs(motorbike, motorbike));
        System.out.println(vehicleGen.genericMethodTwoGenArgs(vehicle, vehicle));
        System.out.println(bottleGen.genericMethodTwoGenArgs(bottle, bottle));
        System.out.println(canGen.genericMethodTwoGenArgs(can, can));
        System.out.println(containerGen.genericMethodTwoGenArgs(container, container));
        System.out.println(mugGen.genericMethodTwoGenArgs(mug, mug));
        System.out.println(storableGen.genericMethodTwoGenArgs(storable, storable));
        System.out.println(rideableGen.genericMethodTwoGenArgs(rideable, rideable));
        System.out.println(transportableGen.genericMethodTwoGenArgs(transportable, transportable));
        System.out.println(animalGen.genericMethodTwoGenArgs(animal, animal));
        System.out.println(beetleGen.genericMethodTwoGenArgs(beetle, beetle));
        System.out.println(carrotGen.genericMethodTwoGenArgs(carrot, carrot));
        System.out.println(chamomileGen.genericMethodTwoGenArgs(chamomile, chamomile));
        System.out.println(crawlableGen.genericMethodTwoGenArgs(crawlable, crawlable));
        System.out.println(crocodileGen.genericMethodTwoGenArgs(crocodile, crocodile));
        System.out.println(flowersGen.genericMethodTwoGenArgs(flowers, flowers));
        System.out.println(flyGen.genericMethodTwoGenArgs(fly, fly));
        System.out.println(insectGen.genericMethodTwoGenArgs(insect, insect));
        System.out.println(maylilyGen.genericMethodTwoGenArgs(maylily, maylily));
        System.out.println(mosquitoGen.genericMethodTwoGenArgs(mosquito, mosquito));
        System.out.println(pigeonGen.genericMethodTwoGenArgs(pigeon, pigeon));
        System.out.println(plantGen.genericMethodTwoGenArgs(plant, plant));
        System.out.println(potatoGen.genericMethodTwoGenArgs(potato, potato));
        System.out.println(radishGen.genericMethodTwoGenArgs(radish, radish));
        System.out.println(ravenGen.genericMethodTwoGenArgs(raven, raven));
        System.out.println(roseGen.genericMethodTwoGenArgs(rose, rose));
        System.out.println(vegetableGen.genericMethodTwoGenArgs(vegetable, vegetable));
        System.out.println(vertebrataGen.genericMethodTwoGenArgs(vertebrata, vertebrata));
        System.out.println(dieselGen.genericMethodTwoGenArgs(diesel, diesel));
        System.out.println(petrolGen.genericMethodTwoGenArgs(petrol, petrol));
        System.out.println(pourableGen.genericMethodTwoGenArgs(pourable, pourable));
        System.out.println(powerableGen.genericMethodTwoGenArgs(powerable, powerable));
        System.out.println(waterGen.genericMethodTwoGenArgs(water, water));
        System.out.println(flyableGen.genericMethodTwoGenArgs(flyable, flyable));
        System.out.println(matterGen.genericMethodTwoGenArgs(matter, matter));

        integerGen.genericMethodHalfGenArgs(1, "integerGen");
        stringGen.genericMethodHalfGenArgs("it's a string", "string too");
        doubleGen.genericMethodHalfGenArgs(21.2, "doubleGen");
        aircraftGen.genericMethodHalfGenArgs(aircraft, "aircraftGen");
        copterGen.genericMethodHalfGenArgs(copter, "copterGen");
        planeGen.genericMethodHalfGenArgs(plane, "planeGen");
        rocketGen.genericMethodHalfGenArgs(rocket, "rocketGen");
        carGen.genericMethodHalfGenArgs(car, "carGen");
        mopedGen.genericMethodHalfGenArgs(moped, "mopedGen");
        motorbikeGen.genericMethodHalfGenArgs(motorbike, "motorbikeGen");
        vehicleGen.genericMethodHalfGenArgs(vehicle, "vehicleGen");
        rideableGen.genericMethodHalfGenArgs(rideable, "rideableGen");
        transportableGen.genericMethodHalfGenArgs(transportable, "transportableGen");
        animalGen.genericMethodHalfGenArgs(animal, "animalGen");
        beetleGen.genericMethodHalfGenArgs(beetle, "beetleGen");
        carrotGen.genericMethodHalfGenArgs(carrot, "carrotGen");
        chamomileGen.genericMethodHalfGenArgs(chamomile, "chamomileGen");
        crawlableGen.genericMethodHalfGenArgs(crawlable, "crawableGen");
        crocodileGen.genericMethodHalfGenArgs(crocodile, "crocodileGen");
        flowersGen.genericMethodHalfGenArgs(flowers, "flowersGen");
        flyGen.genericMethodHalfGenArgs(fly, "flyGen");
        maylilyGen.genericMethodHalfGenArgs(maylily, "maylilyGen");
        mosquitoGen.genericMethodHalfGenArgs(mosquito, "mosquitoGen");
        pigeonGen.genericMethodHalfGenArgs(pigeon, "pigeonGen");
        plantGen.genericMethodHalfGenArgs(plant, "plantGen");
        potatoGen.genericMethodHalfGenArgs(potato, "potatoGen");
        radishGen.genericMethodHalfGenArgs(radish, "radishGen");
        ravenGen.genericMethodHalfGenArgs(raven, "ravenGen");
        roseGen.genericMethodHalfGenArgs(rose, "roseGen");
        vegetableGen.genericMethodHalfGenArgs(vegetable, "vegetableGen");
        vertebrataGen.genericMethodHalfGenArgs(vertebrata, "vertebrataGen");
        flyableGen.genericMethodHalfGenArgs(flyable, "flyableGen");
        matterGen.genericMethodHalfGenArgs(matter, "matterGen");
        dieselGen.genericMethodHalfGenArgs(diesel, "dieselGen");
        petrolGen.genericMethodHalfGenArgs(petrol, "petrolGen");
        waterGen.genericMethodHalfGenArgs(water, "waterGen");
        pourableGen.genericMethodHalfGenArgs(pourable, "pourableGen");
        powerableGen.genericMethodHalfGenArgs(powerable, "powerableGen");
        bottleGen.genericMethodHalfGenArgs(bottle, "bottleGen");
        canGen.genericMethodHalfGenArgs(can, "canGen");
        containerGen.genericMethodHalfGenArgs(container, "containerGen");
        mugGen.genericMethodHalfGenArgs(mug, "mugGen");
        storableGen.genericMethodHalfGenArgs(storable, "storableGen");
    }
}
