package EnumerationsandAnnotations.pr06;


import EnumerationsandAnnotations.pr06.enums.CardSuits;
import EnumerationsandAnnotations.pr06.enums.CardsRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String categoryInput = br.readLine();
        Custom rankAnotation = CardsRank.class.getAnnotation(Custom.class);
        Custom suitsAnotation = CardSuits.class.getAnnotation(Custom.class);

        if (categoryInput.equalsIgnoreCase("rank")) {
            System.out.printf("Type = Enumeration, Description = %s%n", rankAnotation.description());

        } else {
            System.out.printf("Type = Enumeration, Description = %s%n", suitsAnotation.description());
        }


//            System.out.printf("Card name: %s of %s; Card power: %d ", cardRankInput, cardSuitInput, total);
    }

}
