package InterfacesandAbstraction.pr07.modes;


import InterfacesandAbstraction.pr07.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("Name: %s lastName: %s Id: %s Salary %.2f",
                this.getFirstName(), this.getLastName(), this.getId(), this.getSalary());
    }
}
