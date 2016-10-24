package generics.pr02;


public class Box<T> {

    private static final int DEFAULT_CAPACITY = 16;
    private T element;
//    private T[] elements;
//    private int index;

    @SuppressWarnings("unchecked")
    Box(T element) {
        this.element = element;
//        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
//        this.index = 0;
    }

//    public void add(T element) {
//        this.elements[index] = element;
//        this.index++;
//    }
//
//    public T[] getElements() {
//        return this.elements;
//    }

    @Override
    public String toString() {
        return element.getClass() + ": " + String.valueOf(this.element);
    }
}
