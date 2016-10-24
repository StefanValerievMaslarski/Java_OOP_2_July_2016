//package EnumerationsandAnnotations.pr07;
//
//import EnumerationsandAnnotations.pr07.enums.CardSuits;
//import EnumerationsandAnnotations.pr07.enums.CardsRank;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        while (true){
//            if (){
//                break;
//            }
//
//        }
//
//        CardsRank cardRank1 = Enum.valueOf(CardsRank.class, cardRankInput1);
//        int first1 = cardRank1.getPower();
//        CardSuits cardSuits1 = Enum.valueOf(CardSuits.class, cardSuitInput1);
//        int second1 = cardSuits1.getSuits();
//        int total1 = first1 + second1;
//        Card card1 = new Card(cardRank1, cardSuits1, total1);
//
//        CardsRank cardRank2 = Enum.valueOf(CardsRank.class, cardRankInput2);
//        int first2 = cardRank2.getPower();
//        CardSuits cardSuits2  = Enum.valueOf(CardSuits.class, cardSuitInput2);
//        int second2 = cardSuits2.getSuits();
//        int total2 = first2 + second2;
//        Card card2 = new Card(cardRank2, cardSuits2, total2);
//        int number = card1.compareTo(card2);
//
//        if (number < 0){
//            System.out.println(card2);
//        } else {
//            System.out.println(card1);
//        }
//
//
//
//
//
////            System.out.printf("Card name: %s of %s; Card power: %d ", cardRankInput, cardSuitInput, total);
//    }
//
//}
