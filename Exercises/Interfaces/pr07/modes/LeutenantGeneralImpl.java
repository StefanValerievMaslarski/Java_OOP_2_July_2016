//package InterfacesandAbstraction.pr07.modes;
//
//import InterfacesandAbstraction.pr07.interfaces.LeutenantGeneral;
//import InterfacesandAbstraction.pr07.interfaces.Soldier;
//import com.intellij.util.containers.HashSet;
//
//import java.util.Set;
//
//public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
//
//    Set<PrivateImpl> privates;
//
//    public LeutenantGeneralImpl(String id, String firstName, String lastName, double salary) {
//        super(id, firstName, lastName, salary);
//        this.privates = new HashSet<>();
//    }
//
//    public Set<Soldier> getPrivates() {
////        return privates;
//    }
//
//    private void setPrivates(Set<PrivateImpl> privates) {
//        this.privates = privates;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("Name: %s Id: LastName: %s Id: %s Salary: %.2f", this.getFirstName(),
//                this.getLastName(), this.getId(), this.getSalary()))
//                .append(System.lineSeparator())
//                .append("Privates:");
//
//        for (PrivateImpl private1 :this.getPrivates()){
//            sb.append(System.lineSeparator())
//            .append(private1);
//        }
//        return sb.toString();
//    }
//}
//
