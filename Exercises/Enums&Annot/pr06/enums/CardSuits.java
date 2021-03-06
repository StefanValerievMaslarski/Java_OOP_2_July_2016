package EnumerationsandAnnotations.pr06.enums;

import EnumerationsandAnnotations.pr06.Custom;

@Custom(type = "Enumeration",category = "Suit", description = "Provides suit constants for a Card class.")
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
