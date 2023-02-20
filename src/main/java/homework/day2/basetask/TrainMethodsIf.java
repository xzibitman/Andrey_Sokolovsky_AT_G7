package homework.day2.basetask;

public class TrainMethodsIf {
    public int returnNewInt(int x) {
        if (x < 8) {
            return x * 7;
        } else {
            return x / 4;
        }

    }

    public long returnNewLong(long y) {
        if (y > 300) {
            return y - 300;
        } else {
            return y + 20;
        }
    }

    public String returnNewChar(char z) {
        if (z == 'g') {
            return ("go");
        } else {
            return (z + "o");
        }
    }

    public float returnNewFloat(float w) {
        if (w == 0.67f) {
            return (w);
        } else {
            return (w * 2);
        }
    }

    public double returnNewDouble(double e) {
        if (e < 80) {
            if (e > 30) {
                return (e + 87);
            }

        } else if (e > 80) {
            if (e < 400) {
                return (e - 87);
            } else if (e > 400) {
                return (e / 4);
            }
        }

        return (e);
    }

    public void returnNewBoolean(boolean ist) {

        if (ist) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
