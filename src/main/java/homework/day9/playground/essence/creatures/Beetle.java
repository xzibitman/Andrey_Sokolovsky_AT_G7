package homework.day9.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {

        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        String beetleText = "vz-vz-vzz-zz..";
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units %s%n ", getClass().getSimpleName(), this.name, direction, distance, beetleText);

    }

    @Override
    public void crawl(String direction) {
        String beetleText = "vz-vz-vzz-zz..";
        System.out.printf("I am %s, my name is %s and I am crawling to %s %s %n", getClass().getSimpleName(), this.name, direction, beetleText);


    }

    public void nest(Carrot home) {
        String nestText;

        if (this.mass < home.getMass()) {
            nestText = String.format("I am %s and I will nest there with %.0d my family members!", getName(), (home.getMass() / mass));
            System.out.println(nestText);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
