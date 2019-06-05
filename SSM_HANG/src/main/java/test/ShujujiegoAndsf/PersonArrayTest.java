package test.ShujujiegoAndsf;

public class PersonArrayTest {
    public static void main(String[] args) {
        PersonArray Personarray = new PersonArray();
        Person p1 = new Person("张三", 20, "男");
        Person p2 = new Person("李四", 21, "男");
        Person p3 = new Person("颇丰", 22, "女");
        Person p4 = new Person("赵云", 23, "男");
        Person p5 = new Person("貂蝉", 24, "女");
        Person p6 = new Person("小蝶", 25, "女");

        Personarray.insert(p1);
        Personarray.insert(p2);
        Personarray.insert(p3);
        Personarray.insert(p4);
        Personarray.insert(p5);
        Personarray.insert(p6);

        Personarray.display();
        Personarray.delete("颇丰");
        Personarray.display();

    }
}
