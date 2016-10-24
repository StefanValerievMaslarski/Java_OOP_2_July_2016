package InterfacesandAbstraction.pr07.modes;


import InterfacesandAbstraction.pr07.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private String codeNumber;

    public SpyImpl(String id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
//        this.setCodeNumber(codeNumber);
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s LastName: %s Id: %s", this.getFirstName(), this.getLastName(), this.getId()))
        .append(System.lineSeparator())
        .append(String.format("Code Number: %s", this.getCodeNumber()))
        .append(System.lineSeparator());
        return sb.toString();
    }
}
