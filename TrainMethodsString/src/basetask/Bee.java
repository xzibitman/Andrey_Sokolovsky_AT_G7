package basetask;


public class Bee {
    public String gender;
    public long weight;

    public Bee() {
        this.gender = "Male";
        this.weight = 132;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        long newWeight = 500 / weight;
        System.out.println("Я легче лося в " + newWeight + " раз");
    }
}
