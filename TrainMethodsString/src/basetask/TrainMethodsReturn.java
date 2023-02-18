package basetask;

public class TrainMethodsReturn {
    int number;
    long lNumber;
    char charSymbol = 'X';

    float fNumber = 9.5f;

    double dNumber = 10.3;

    short sNumber = 2;

    byte bNumber = 4;

    boolean booleanValue = true;
    int a = 3;
    int b = 7;
    int returnNewInt() {
        int newNumber = number*3;
        return newNumber;
    }
    long returnNewLong() {
        long newLong = lNumber-4;
        return newLong;
    }
    char returnNewChar(){
        char newChar = charSymbol;
        return newChar;
    }
    float returnNewFloat() {
        float newFloat = fNumber/2;
        return newFloat;
    }
    double returnNewDouble() {
        double newDouble = dNumber + 8;
        return newDouble;
    }
    short returnNewShort() {
        short newShort = (short)(sNumber - 1);
        return newShort;
    }
    byte returnNewByte() {
        byte newByte = (byte)(bNumber *2);
        return newByte;
    }

    boolean returnNewBoolean() {
        boolean booleanValue = a==b;
        return booleanValue;
    }
}
