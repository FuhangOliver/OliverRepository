package test;

import java.io.Serializable;

public class Person implements Comparable, Serializable {
    private static final long serialVersionUID = 15456l;
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public Person() {
        super();
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        int temp = this.Age - p.Age;
        return this.Age == p.Age ? this.Name.compareTo(p.Name) : temp;

//        if(this.Age > p.Age)
//            return 1;
//        if(this.Age < p.Age)
//            return -1;
//        return 0;
    }
}
