package EnumerationsandAnnotations.pr01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Card Suits:");
        for (CardSuits card : CardSuits.values()) {
            System.out.printf("Ordinal value: %s; Name value: %s%n", card.ordinal(), card.name());
        }

    }

}
