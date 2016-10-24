package EnumerationsandAnnotations.pr04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cardRankInput = br.readLine();
        String cardSuitInput = br.readLine();

        CardsRank cardRank = Enum.valueOf(CardsRank.class, cardRankInput);
        int first = cardRank.getPower();
        CardSuits cardSuits  = Enum.valueOf(CardSuits.class, cardSuitInput);
        int second = cardSuits.getSuits();
        int total = first + second;
        Card card = new Card(cardRank, cardSuits, total);
        System.out.println(card);
//            System.out.printf("Card name: %s of %s; Card power: %d ", cardRankInput, cardSuitInput, total);
    }

}
