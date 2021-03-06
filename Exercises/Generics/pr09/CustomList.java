package generics.pr09;


interface CustomList<T extends Comparable<T>> extends Iterable<T>{

    void add(T element);
	T remove(int index);
	boolean contains(T element);
	void swap(int firstIndex, int secondIndex);
	int countGreaterThat(T element);
	T getMax();
	T getMin();
	int getSize();
	T getEl(int index);
	int getIndex(T element);



}
