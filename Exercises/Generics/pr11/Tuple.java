package generics.pr11;


public class Tuple<E1,E2, E3> {

    private E1 item1;
    private E2 item2;
    private E3 item3;

    public Tuple(E1 item1, E2 item2, E3 item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public E1 getItem1() {
        return item1;
    }

    private void setItem1(E1 item1) {
        this.item1 = item1;
    }

    public E2 getItem2() {
        return item2;
    }

    private void setItem2(E2 item2) {
        this.item2 = item2;
    }

    private E3 getItem3() {
        return item3;
    }

    private void setItem3(E3 item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.valueOf(this.item1) + " -> " + String.valueOf(this.item2) + " -> " + String.valueOf(this.item3);
    }

}
