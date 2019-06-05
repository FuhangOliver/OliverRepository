package test.ShujujiegoAndsf;

public class Person {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, int age, String sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public void display() {
        System.out.print("姓名：" + name);
        System.out.print("年龄：" + age);
        System.out.print("性别：" + sex);
        System.out.println();
    }
}
