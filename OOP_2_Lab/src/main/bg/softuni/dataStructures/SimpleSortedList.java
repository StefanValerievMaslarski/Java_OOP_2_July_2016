package main.bg.softuni.dataStructures;


import main.bg.softuni.contracts.SimpleOrderedBag;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class SimpleSortedList<E extends Comparable<E>> implements SimpleOrderedBag<E> {

    private static final int DEFAULT_SIZE = 16;

    private E[] innerCollection;
    private int size;
    private Comparator<E> comparator;

    public SimpleSortedList(Class<E> type, Comparator<E> comparator, int capacity) {
        this.initializeInnerCollection(type, capacity);
        this.comparator = comparator;
    }

    public SimpleSortedList(Class<E> type, int capacity) {
        this(type, Comparable::compareTo, capacity);
    }

    public SimpleSortedList(Class<E> type, Comparator<E> comparator) {
        this(type, comparator, DEFAULT_SIZE);
    }

    public SimpleSortedList(Class<E> type) {
        this(type, Comparable::compareTo, DEFAULT_SIZE);
    }


    @SuppressWarnings("unchecked")
    private void initializeInnerCollection(Class<E> type, int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative!");

        }
        this.innerCollection = (E[]) Array.newInstance(type, capacity);
//        this.innerCollection = (E[]) new Object[capacity];
    }

    @Override
    public boolean remove(E element) {
        boolean hasBeenRemoved = false;
        int indexRemovedElement = 0;
        if (element == null){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < this.size; i++) {
            if (this.innerCollection[i].compareTo(element) == 0) {
                indexRemovedElement = i;
                this.innerCollection[i] = null;
                hasBeenRemoved = true;

                break;
            }
        }

        if (hasBeenRemoved) {


            for (int i = indexRemovedElement; i < this.size() - 1; i++) {
                this.innerCollection[i] = this.innerCollection[i + 1];
            }
            this.innerCollection[this.size() - 1] = null;
            this.size--;
        }

        return hasBeenRemoved;
    }

    @Override
    public int capacity() {
        return this.innerCollection.length;
    }

    @Override
    public void add(E element) {
        if (element == null){
            throw new IllegalArgumentException();

        }

        if (this.size >= this.innerCollection.length) {
            this.resize();
        }

        this.innerCollection[this.size()] = element;
        this.size++;
        Arrays.sort(this.innerCollection, 0, this.size, this.comparator);

    }


    @Override
    public void addAll(Collection<E> elements) {
        if (elements == null){
            throw new IllegalArgumentException();
        }
        if (this.size() + elements.size() >= this.innerCollection.length) {
            this.multyResize(elements);
        }
        for (E element : elements) {
            this.innerCollection[this.size()] = element;
            this.size++;
        }
        Arrays.sort(this.innerCollection, 0, this.size, this.comparator);

    }

    private void multyResize(Collection<E> elements) {
        int newSize = this.innerCollection.length * 2;
        while (this.size() + elements.size() >= newSize) {
            newSize *= 2;
        }
        E[] newCollection = Arrays.copyOf(this.innerCollection, newSize);
        this.innerCollection = newCollection;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String joinWith(String joiner) {
        if (joiner == null){
            throw new IllegalArgumentException();
        }
        StringBuilder output = new StringBuilder();
        for (E e : this) {
            output.append(e);
            output.append(joiner);
        }
        output.setLength(output.length() - joiner.length());
        return output.toString();
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (this.index < size()) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                return innerCollection[this.index++];
            }

        };
        return iterator;
    }

    private void resize() {
        E[] newCollections = Arrays.copyOf(this.innerCollection, this.innerCollection.length * 2);
        this.innerCollection = newCollections;
    }

    //bubble sort
    public static void BubbleSort(int[] num) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1])   // change to > for ascending sort
                {
                    temp = num[j];                //swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }
}
