package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn znak = new TrainMethodsReturn();
        znak.number = 8;
        int numberOne = znak.returnNewInt();
        System.out.println("метод returnNewInt вернул " + numberOne);

        znak.lNumber = 10;
        long numberLong = znak.returnNewLong();
        System.out.println("метод returnNewLong вернул " + numberLong);


        char newChar = znak.returnNewChar();
        System.out.println("метод returnNewChar вернул " + newChar + newChar);

        float newFloat = znak.returnNewFloat();
        System.out.println("метод returnNewFloat вернул " + newFloat);

        double newDouble = znak.returnNewDouble();
        System.out.println("метод returnNewDouble вернул " + newDouble);

        short newShort = znak.returnNewShort();
        System.out.println("метод returnNewShort вернул " + newShort);

        byte newByte = znak.returnNewByte();
        System.out.println("метод returnNewByte вернул " + newByte);

        boolean newBoolean = znak.returnNewBoolean();
        System.out.println("метод returnNewBoolean вернул " + newBoolean);
    }

}
