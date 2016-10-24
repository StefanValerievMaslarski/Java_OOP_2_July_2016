package generics.pr07;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {


    private List<T> list;

    public int getIndex(T element){
        return this.list.indexOf(element);
    }


    public T getEl(int index){
        return this.list.get(index);
    }

    public int getSize () {
        return this.list.size();
    }

    public CustomListImpl() {
        this.list = new ArrayList<T>();
    }


    @Override
    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public T remove(int index) {
        return this.list.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.list.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {

//        Collections.swap(this.list, firstIndex, secondIndex);
        T firstEl = this.list.get(firstIndex);
        T secondEl = this.list.get(secondIndex);

        this.list.set(firstIndex, secondEl);
        this.list.set(secondIndex, firstEl);
    }

    @Override
    public int countGreaterThat(T element) {
        int countGreater = 0;
        for (T current : this.list) {
            if (current.compareTo(element) > 0){
                countGreater++;
            }
        }
        return countGreater;
    }

    @Override
    public T getMax() {

        return this.list.stream().max(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
//                return o1.compareTo(o2);

                if (o1.compareTo(o2) > 0){
                    return 1;
                }

                if (o1.compareTo(o2) < 0){
                    return -1;
                }
                return 0;
            }
        }).get();
    }

    @Override
    public T getMin() {
        T min = this.list.get(0);
        for (int i = 1; i < this.list.size() ; i++) {
            if (min.compareTo(this.list.get(i)) > 0){
                min = this.list.get(i);
            }
        }
        return min;
    }


}
