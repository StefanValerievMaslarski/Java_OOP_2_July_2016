package InterfacesandAbstraction.pr06;


import InterfacesandAbstraction.pr05.Checkable;

class Robot implements Checkable {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String chechId(String idNumber) {
        return null;
    }

    public String getId() {
        return id;
    }
}
