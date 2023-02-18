package basetask;

public class Pineapple {
    public String grade;
    public double heatCapacity;
    public Pineapple() {
        this.grade = "sort";
        this.heatCapacity = 5512.45;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public double getHeatCapacity() {
        return heatCapacity;
    }
    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }
    public void printPineappleDetails() {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }

    }
}
