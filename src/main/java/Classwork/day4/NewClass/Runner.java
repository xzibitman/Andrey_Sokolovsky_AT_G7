package Classwork.day4.NewClass;


public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);
    }
}
