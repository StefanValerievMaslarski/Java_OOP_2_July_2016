package InterfacesandAbstraction.pr05;


public class Citizen implements Checkable {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String chechId(String idNumber) {
        return null;
    }

    private String getId() {
        return id;
    }
}
