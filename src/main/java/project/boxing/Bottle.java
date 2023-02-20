package project.boxing;

import project.state.Bubble;
import project.state.SparklingWater;

public class Bottle {
    private double bottleVolume;
    private SparklingWater bottleWater;

    public void open() {
        bottleWater.degas();
    }

    public Bottle(double bottleVolume, String gas) {
        this.bottleVolume = bottleVolume;
        this.bottleWater = new SparklingWater(bottleVolume, gas);
    }
    public double getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public SparklingWater getBottleWater() {
        return bottleWater;
    }

    public void setBottleWater(SparklingWater bottleWater) {
        this.bottleWater = bottleWater;
    }
}
