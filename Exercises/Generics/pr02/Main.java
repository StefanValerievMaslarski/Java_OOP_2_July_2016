package generics.pr02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Integer input = Integer.valueOf(br.readLine());
            Box<Integer> box = new Box<>(input);
            System.out.println(box);
        }

    }

}
