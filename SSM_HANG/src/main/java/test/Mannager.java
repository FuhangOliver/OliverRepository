package test;

public class Mannager extends Employee {

    private int bonus;

    Mannager(String name, String id, Double pay, int bonus) {
        super(name, id, pay);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.printf("manage......");
    }
}
