package Classwork;

public class ObjectContainer {
    int position = 0;

    Object[] addObject = new Object[10];

    public void add(Object incoming) {
        if (position < addObject.length) {
            addObject[position++] = incoming;
        }
    }

    public Object removeLast() {
        Object verb = null;
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
