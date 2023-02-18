package basetask;

import java.util.SplittableRandom;

public class Obstacle {
    public String description;
    public String severity;
    public Obstacle() {
        this.description = "defaultDesc";
        this.severity = "defaultSever";
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSeverity() {
        return severity;
    }
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    public void printObstacleDetails() {
        System.out.println("Возникло " + description + " препятствиие " + severity);
    }
}
