package homework.day15;


public class GenericMethodsInGenericClassT <T> {
    public void genericMethodOneGenArg(T firstArg) {

        System.out.printf("I am an object of %s class", firstArg.getClass().getSimpleName());
    }
    public String genericMethodTwoGenArgs(T secondArg, T thirdArg) {
        return ("We are objects of " + secondArg.getClass().getSimpleName() + " class and " + thirdArg.getClass().getSimpleName() + " class");
    }
    public void genericMethodHalfGenArgs(T fhourthArg, String text) {
        System.out.printf("I got an object of %s class and string with %d characters", fhourthArg.getClass().getSimpleName(), text.length());
    }


}

