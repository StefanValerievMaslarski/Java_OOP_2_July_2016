package generics.pr07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> myList = new CustomListImpl<>();


        String input = null;
        input = br.readLine();
        while (!input.equals("END")){
            String[] commands = input.split("\\s+");
            String command = commands[0];
            input = br.readLine();

            switch (command){

                case "Add":
                    String toAdd = commands[1];
                    myList.add(toAdd);
                    break;

                case "Remove":
                    Integer indexToRemove = Integer.parseInt(commands[1]);
                    myList.remove(indexToRemove);
                    break;

                case "Contains":
                    String elToContains = commands[1];
                    System.out.println(myList.contains(elToContains));
                    break;

                case "Greater":
                    String elToCheck = commands[1];
                    System.out.println(myList.countGreaterThat(elToCheck));
                    break;

                case "Max":
                    System.out.println(myList.getMax());
                    break;

                case "Min":
                    System.out.println(myList.getMin());
                    break;

                case "Swap":
                    myList.swap(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;

                case "Print":

                    for (int i = 0; i < myList.getSize(); i++) {
                        System.out.println(myList.getEl(i));
                    }
                    break;

                case "Sort":
                    Sorter<String> sorter = new SorterImpl<>();
                    sorter.sort(myList);

                    break;

                default:
                    break;

            }


        }

    }

}
