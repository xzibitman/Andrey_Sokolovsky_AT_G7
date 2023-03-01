package homework.day9.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {

        super(mass, name);
    }

    public void crawlable() {

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
