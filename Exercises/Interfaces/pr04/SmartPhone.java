package InterfacesandAbstraction.pr04;


public class SmartPhone implements Callable, Browsable {
    public SmartPhone() {
    }

    @Override
    public String browse(String site) {
        return "Browsing: " + site + "!";
    }

    @Override
    public String call(String number) {
        return "Calling... " + number;
    }
}
