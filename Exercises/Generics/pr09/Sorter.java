package generics.pr09;


public interface Sorter<T extends Comparable<T>> {

    void sort(CustomList<T> list);

}
