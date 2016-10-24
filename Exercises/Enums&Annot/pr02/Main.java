package EnumerationsandAnnotations.pr02;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input + ":");
        for (Cards card : Cards.values()) {
            System.out.printf("Ordinal value: %s; Name value: %s%n", card.ordinal(), card.name());
        }

    }

}
