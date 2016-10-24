//package InterfacesandAbstraction.pr07.modes;
//
//
//import InterfacesandAbstraction.pr07.interfaces.Commando;
//import InterfacesandAbstraction.pr07.interfaces.Mission;
//
//import java.util.List;
//import java.util.Set;
//
//import static com.sun.org.apache.xml.internal.serialize.OutputFormat.Defaults.Indent;
//
//public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
//
//    private Set<Mission> missions;
//
//    public CommandoImpl(String id, String firstName, String lastName, double salary, String corp, List<Mission> missions) {
//        super(id, firstName, lastName, salary, corp);
//        this.setMissions(missions);
//    }
//
//    public Set<Mission> getMissions() {
//        return missions;
//    }
//
//
//    public void CompleteMission() {
//
//    }
//
//    private void setMissions(Set<Mission> missions) {
//        this.missions = missions;
//    }
//
//
//
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("Name: %s LastName: %s Id: %s Salary: %.2f", this.getFirstName(),
//                this.getLastName(), this.getSalary()));
//
//        sb
//        .append(String.format("Corps: %s", this.getCorp()))
//        .append("Missions:%n");
//
//        for (Mission currentMission : this.getMissions()) {
//            sb.append(System.lineSeparator())
//            .append(String.format("%s%s", Indent, currentMission));
//        }
//
//        return sb.toString();
//    }
//}
