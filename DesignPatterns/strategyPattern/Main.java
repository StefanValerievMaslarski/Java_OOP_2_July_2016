package test.stratgyPattern;


public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Behaviour aggressive = new AgressiveBehaviour();
        robot.setBehaviour(aggressive);
        robot.move();

        robot.setBehaviour(new DefensiveBehaviour());
        robot.move();
    }

}
