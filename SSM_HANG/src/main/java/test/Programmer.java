package test;

public class Programmer extends Employee {
    Programmer(String name, String id, Double pay) {
        super(name, id, pay);
    }

    public void work() {
        System.out.printf("Code......");
    }
}
