package generics.pr05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Box<String>> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Box<String> box = new Box<>(input);
            myList.add(box);
        }
        Box<String> boxToCompareWith = new Box<>(br.readLine());
        int count = returnCountGreaterElement(myList, boxToCompareWith);
        System.out.println(count);


    }

    public static <T extends Comparable<T>> int returnCountGreaterElement(List<Box<T>> list, Box<T> other){

        int counterOfGreater = 0;
        for (Box<T> currentBox : list) {
            if (currentBox.compareTo(other) > 0){
                counterOfGreater++;
            }
        }
        return counterOfGreater;
    }
}
