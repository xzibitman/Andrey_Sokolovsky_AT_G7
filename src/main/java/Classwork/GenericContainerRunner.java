package Classwork;

public class GenericContainerRunner {
    public static void main(String[] args) {
        GenericContainer<Integer> integerGenericContainer = new GenericContainer<>();


        for (int i = 0; i < 10; i++) {
            integerGenericContainer.add(i);
        }
        while (!integerGenericContainer.isEmpty()) {
            System.out.println(integerGenericContainer.removeLast());
        }


    }
}
