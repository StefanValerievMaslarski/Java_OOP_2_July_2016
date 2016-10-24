package InterfacesandAbstraction.pr09;

import InterfacesandAbstraction.pr09.interfaces.Addable;
import InterfacesandAbstraction.pr09.interfaces.Removable;
import InterfacesandAbstraction.pr09.interfaces.Useable;
import InterfacesandAbstraction.pr09.models.AddCollection;
import InterfacesandAbstraction.pr09.models.AddRemoveCollection;
import InterfacesandAbstraction.pr09.models.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        Addable addCollection = new AddCollection();
        Removable addRemoveCollection = new AddRemoveCollection();
        Useable myList = new MyList();

        for (String elementToAdd : input) {
            System.out.printf(String.format("%d ", addCollection.add(elementToAdd)));
        }
        System.out.println();

        for (String elementToAdd : input) {
            System.out.print(String.format("%d ", addRemoveCollection.add(elementToAdd)));
        }
        System.out.println();

        for (String elementToAdd : input) {
            System.out.print(String.format("%d ", myList.add(elementToAdd)));
        }
        System.out.println();

        int numberOfRemovedOperations = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfRemovedOperations; i++) {
            System.out.print(String.format("%s ", addRemoveCollection.remove()));
        }
        System.out.println();

        for (int i = 0; i < numberOfRemovedOperations; i++) {
            System.out.print(String.format("%s ", myList.remove()));
        }
        System.out.println();


    }
}
