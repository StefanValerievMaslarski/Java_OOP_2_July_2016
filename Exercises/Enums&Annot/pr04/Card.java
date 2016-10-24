package EnumerationsandAnnotations.pr04;


public class Card {
    private CardsRank cardRank;
    private CardSuits cardSuit;
    private int totalValue;

    private int getTotalValue() {
        return this.totalValue;
    }

    public Card(CardsRank cardRank, CardSuits cardSuit, int totalValue) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.totalValue = totalValue;
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
}
