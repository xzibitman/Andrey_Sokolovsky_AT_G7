package homework.day9.playground.processors;

import homework.day9.playground.essence.creatures.Crawlable;
import homework.day9.playground.utils.DirectionGenerator;
import homework.day9.playground.utils.DistanceGenerator;

public class CrawlableProcessor implements Crawlable {
    @Override
    public void crawl(String direction, int distance) {


    }

    @Override
    public void crawl(String direction) {

    }

    public void runCrawlable(Crawlable crawlable) {
        String direction = DirectionGenerator.generateDirection();
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);

    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);

    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction);

    }

}
