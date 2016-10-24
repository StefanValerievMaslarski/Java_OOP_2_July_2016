package generics.pr06;

import java.util.List;

class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private static final int DEFAULT_CAPACITY = 16;

    private List<T> list;
    private T element;

    @SuppressWarnings("unchecked")
    Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass() + ": " + String.valueOf(this.element);
    }

    @Override
    public int compareTo(Box<T> box) {
       return this.element.compareTo(box.element);
    }
}
