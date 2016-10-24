package InterfacesandAbstraction.pr07.modes;

public class RepairImpl {
    private String partName;
    private int hoursWorked;

    public RepairImpl(String partName, int hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    public String getPartName() {
        return partName;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.getPartName(), this.getHoursWorked());
    }
}
