package InterfacesandAbstraction.pr07.modes;


import InterfacesandAbstraction.pr07.interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private String corp;

    public SpecialisedSoldierImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        this.setCorp(corp);
    }

    public String getCorp() {
        return corp;
    }

    private void setCorp(String corp) {
        if (!corp.trim().equalsIgnoreCase("Airforces") && !corp.trim().equalsIgnoreCase("Marines")){
            throw new IllegalArgumentException("SpecialSoldier must be Marine Or Airforce.");
        }

        this.corp = corp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(delimiter);
        sb.append("Corps: ");
        sb.append(this.getCorp());
        return sb.toString();
    }
}
