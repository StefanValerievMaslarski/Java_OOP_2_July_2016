//package InterfacesandAbstraction.pr07.modes;
//
//
//import InterfacesandAbstraction.pr07.interfaces.Engineer;
//import InterfacesandAbstraction.pr07.interfaces.Repair;
//
//import java.util.List;
//import java.util.Set;
//
//import static com.sun.org.apache.xml.internal.serialize.OutputFormat.Defaults.Indent;
//
//public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
//
//    private Set<Repair> repairs;
//
//    public EngineerImpl(String id, String firstName, String lastName, double salary, String corp, List<Repair> repairs) {
//        super(id, firstName, lastName, salary, corp);
//        this.setRepairs(repairs);
//
//    }
//
//    public Set<Repair> getRepairs() {
//        return this.repairs;
//    }
//
//    private void setRepairs(Set<Repair> repairs) {
//        this.repairs = repairs;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("Name: %s LastName: %s Id: %s Salary: %.2f", this.getFirstName(), this.getLastName(),
//                this.getSalary()));
//        sb
//        .append(String.format("Corps: %s", this.getCorp()));
//
//        for (Repair repair : this.getRepairs()) {
//            sb
//            .append(System.lineSeparator())
//            .append(String.format("%s%s", Indent, repair));
//        }
//        return sb.toString();
//    }
//}
//
//
