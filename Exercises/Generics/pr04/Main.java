package generics.pr04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Box<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer input = Integer.valueOf(br.readLine());
            Box<Integer> box = new Box<>(input);
            myList.add(box);
        }

        String[] indexesToSwap = br.readLine().split(" ");
        Integer firstPos = Integer.valueOf(indexesToSwap[0]);
        Integer secondPos = Integer.valueOf(indexesToSwap[1]);

        swap(myList, firstPos, secondPos);

        for (Box<Integer> element : myList) {
            System.out.println(element.toString());
        }
    }

    public static <T> void swap(List<Box<T>> list, int firstPos, int secondPos){

        T firstEl = (T) list.get(firstPos);
        T secondEl = (T) list.get(secondPos);

        list.set(firstPos, (Box<T>) secondEl);
        list.set(secondPos, (Box<T>) firstEl);

    }
}
