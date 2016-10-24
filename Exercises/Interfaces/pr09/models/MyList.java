package InterfacesandAbstraction.pr09.models;


import InterfacesandAbstraction.pr09.interfaces.Useable;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyList implements Useable {

    Deque<String> myDeque;

    public MyList() {
        this.myDeque = new ArrayDeque<>();
    }

    public int add(String element) {
        this.myDeque.addFirst(element);
        return 0;
    }

    public String remove() {
        return this.myDeque.poll();
    }

    public int used() {
        return this.myDeque.size();
    }

}
