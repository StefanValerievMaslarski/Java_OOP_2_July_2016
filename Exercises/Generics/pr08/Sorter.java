package generics.pr08;


public interface Sorter<T extends Comparable<T>> {

    void sort(CustomList<T> list);

}
