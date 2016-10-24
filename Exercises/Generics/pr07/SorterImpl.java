package generics.pr07;


public class SorterImpl<T extends Comparable<T>> implements Sorter<T> {


    @Override
    public void sort(CustomList<T> list) {
        for (int i = 0; i < list.getSize(); i++) {
            T current = list.getEl(i);
            for (int j = i + 1; j < list.getSize(); j++) {
                if (current.compareTo(list.getEl(j)) > 0 ){
                    list.swap(i, j);
                }

            }
        }
    }
}
