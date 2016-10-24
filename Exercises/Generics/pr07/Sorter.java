package generics.pr07;


public interface Sorter<T extends Comparable<T>> {

    void sort(CustomList<T> list);

}
