package InterfacesandAbstraction.pr09.models;


import InterfacesandAbstraction.pr09.interfaces.Removable;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddRemoveCollection implements Removable {

    Deque<String> deque;

    public AddRemoveCollection() {
        this.deque = new ArrayDeque<>();
    }

    public int add(String element) {
        this.deque.addFirst(element);
        return 0;
    }

    public String remove() {
        return this.deque.pollLast();
    }
}
