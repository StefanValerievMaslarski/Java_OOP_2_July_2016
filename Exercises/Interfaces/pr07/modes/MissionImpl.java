package InterfacesandAbstraction.pr07.modes;


public class MissionImpl {
    private String codeName;
    private String state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.state = state;
    }


    public String getCodeName() {
        return codeName;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        if (!state.equalsIgnoreCase("inProgress") && !state.equalsIgnoreCase("Finished")){
            throw new IllegalArgumentException("Enter valid state for mission!");
        }
        this.state = state;
    }

    public void CompleteMission(){
        this.setState("Finished");
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.getCodeName(), this.getState());
    }
}

