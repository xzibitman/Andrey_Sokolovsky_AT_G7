package project.state;

public class SparklingWater extends Water {
    private boolean isOpened = true;
    private Bubble[] bubbles;
    private String necessaryBubbles;
    private double bubbleAmount;

   // private double calcBubbleAmount(double volume) {
   //     return volume * 10000;
   // }

    public SparklingWater(double volume, String gas) {
        private boolean isOpened();



        necessaryBubbles = gas;
        bubbleAmount = calcBubbleAmount(volume);
        bubbles = new Bubble[(int) bubbleAmount];
        this.pump(bubbles);
    }

    private void pump(Bubble[] bubbles) {
        int i = 0;
        while (i < bubbles.length)
            bubbles[i++] = new Bubble(necessaryBubbles);
    }

    public void degas() {
        int i;
        for (i = 0; i < bubbleAmount; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public String getNecessaryBubbles() {
        return necessaryBubbles;
    }

    public void setNecessaryBubbles(String necessaryBubbles) {
        this.necessaryBubbles = necessaryBubbles;
    }

    public double getBubbleAmount() {
        return bubbleAmount;
    }

    public void setBubbleAmount(double bubbleAmount) {
        this.bubbleAmount = bubbleAmount;
    }
}





