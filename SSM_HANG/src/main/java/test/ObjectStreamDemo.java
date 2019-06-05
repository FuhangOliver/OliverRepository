package test;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectTest(new Person("xiaoqiang", 22));
        Person person = readObjectTest();
        System.out.println("name:" + person.getName() + "::age:" + person.getAge());

    }

    public static Person readObjectTest() throws IOException, ClassNotFoundException {
        File file = new File("src\\main\\java\\test\\Resources\\obj.object");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Person person = (Person) ois.readObject();
        ois.close();
        return person;
    }

    public static void writeObjectTest(Person xiaoqiang) throws IOException {
        File file = new File("src\\main\\java\\test\\Resources");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(file, "obj.object")));
        oos.writeObject(xiaoqiang);
        oos.close();

    }
}
