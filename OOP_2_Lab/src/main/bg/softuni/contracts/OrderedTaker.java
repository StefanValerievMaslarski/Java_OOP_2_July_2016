package main.bg.softuni.contracts;


public interface OrderedTaker {
    void orderAndTake(String courseName, String orderType, int studentsToTake);
    void orderAndTake(String courseName, String orderType);
}
