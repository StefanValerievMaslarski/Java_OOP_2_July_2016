package InterfacesandAbstraction.pr09.models;

import InterfacesandAbstraction.pr09.interfaces.Addable;

import java.util.ArrayList;
import java.util.List;

public class AddCollection implements Addable {

    private List<String> list;

    public AddCollection() {
        this.list = new ArrayList<>();
    }

    @Override
    public int add(String element) {

        this.list.add(element);

        return (this.list.size() - 1);

    }

}
