package EnumerationsandAnnotations.pr07;

import EnumerationsandAnnotations.pr07.enums.CardSuits;
import EnumerationsandAnnotations.pr07.enums.CardsRank;

class Card implements Comparable<Card>{
    private CardsRank cardRank;
    private CardSuits cardSuit;
    private int totalValue;

    public Card(CardsRank cardRank, CardSuits cardSuit, int totalValue) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.totalValue = totalValue;
    }

    private int getTotalValue() {
        return this.totalValue;
    }

    public CardsRank getCardRank() {
        return cardRank;
    }

    private void setCardRank(CardsRank cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    private void setCardSuit(CardSuits cardSuit) {
        this.cardSuit = cardSuit;
    }


    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.getCardRank().toString(),
                this.getCardSuit().toString(), this.getTotalValue());
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getTotalValue(), other.getTotalValue());
    }
}
