package test;

public abstract class Employee {
    private String name;
    private String id;
    private Double pay;

    Employee(String name, String id, Double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public abstract void work();
}
