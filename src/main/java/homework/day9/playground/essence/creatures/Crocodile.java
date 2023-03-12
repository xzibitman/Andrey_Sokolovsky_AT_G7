package homework.day9.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        String crocText = "wr-wr-wrr-r..";
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units %s%n", getClass().getSimpleName(), this.name, direction, distance, crocText);

    }

    @Override
    public void crawl(String direction) {
        String crocText = "wr-wr-wrr-r..";
        System.out.printf("I am %s, my name is %s and I am crawling to %s %s %n", getClass().getSimpleName(), this.name, direction, crocText);

    }

}

