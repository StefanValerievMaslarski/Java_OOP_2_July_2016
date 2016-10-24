package InterfacesandAbstraction.pr07.modes;

import InterfacesandAbstraction.pr07.interfaces.Soldier;

public abstract class SoldierImpl implements Soldier {
    protected final String delimiter = System.getProperty("line.separator");
    protected final String Indent = "  ";

    private String id;
    private String firstName;
    private String lastName;

    public SoldierImpl(String id, String firstName, String lastName) {
        this.setFirstName(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, LastName: %s, Id: %s", this.getFirstName(), this.getLastName(), this.getId());
    }
}
