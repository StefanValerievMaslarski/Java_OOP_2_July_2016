package test.stratgyPattern;


public class AgressiveBehaviour implements Behaviour{

    @Override
    public void moveCommand() {
        System.out.println("Aggressive");
    }
}
