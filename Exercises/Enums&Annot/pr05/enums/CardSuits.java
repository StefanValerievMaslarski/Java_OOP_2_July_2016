package EnumerationsandAnnotations.pr05.enums;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES (39);

    private Integer suit;

    CardSuits(Integer suit){
        this.suit = suit;
    }

    public Integer getSuits() {
        return this.suit;
    }
}
