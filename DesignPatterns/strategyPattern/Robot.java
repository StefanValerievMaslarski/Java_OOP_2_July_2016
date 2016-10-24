package test.stratgyPattern;


public class Robot {

    private Behaviour strategy;

    public void setBehaviour(Behaviour strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.moveCommand();

    }
}
