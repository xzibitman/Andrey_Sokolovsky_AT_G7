package Classwork;

public class GenericContainer <T> {
    T[] addObject = (T[]) new Object[10];
    int position = 0;


    public void add(T incoming) {
        if (position < addObject.length) {
            addObject[position++] = incoming;
        }
    }

    public T removeLast() {
        T verb = null;
        if (position != 0) {
            verb = addObject[position - 1];
            addObject[position-- - 1] = null;
        }
        return verb;
    }

    public boolean isEmpty() {
        return position == 0;
    }
}
