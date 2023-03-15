package homework.day15;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X firstArg, Y secondArg) {
        return ("I received " + 2 + " arguments of type: " + firstArg.getClass().getSimpleName() + " class, " + secondArg.getClass().getSimpleName() + " class ");
    }
    public void genericMethodHalfGenArgs(X thirdArg, Y fourthArg, String text) {
        System.out.printf("I got an object of %s class and %s class and string with %d characters %n", thirdArg.getClass().getSimpleName(), fourthArg.getClass().getSimpleName(), text.length());
    }

    public void genericMethodHalfGenArgs(X fifthArg, String text) {
        System.out.printf("I got an object of %s class and string with %d characters %n", fifthArg.getClass().getSimpleName(), text.length());
    }
//    public void genericMethodHalfGenArgs(Y sixthArg, String text) {
//        System.out.printf("I got an object of %s class and string with %d characters", sixthArg.getClass().getSimpleName(), text.length());
//    }
}

