package generics.pr04;
import java.util.List;

public class Box<T> {

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


}
