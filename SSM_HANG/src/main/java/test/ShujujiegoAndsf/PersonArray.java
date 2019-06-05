package test.ShujujiegoAndsf;

public class PersonArray {
    private Person[] Personarr;
    private int elems;

    public PersonArray() {
        Personarr = new Person[50];
    }

    public PersonArray(int max) {
        Personarr = new Person[max];
    }

    public void insert(Person p) {
        Personarr[elems] = p;
        elems++;
    }

    public void display() {
        for (int i = 0; i < elems; i++) {
            Personarr[i].display();
        }
    }

    public int find(String nameKey) {
        int i;
        for (i = 0; i < elems; i++) {
            if (Personarr[i].getName().equals(nameKey))
                break;
        }
        if (i == Personarr.length)
            return -1;
        else
            return i;
    }

    public void delete(Person person) {
        if (find(person.getName()) == -1) {
            System.out.println("未查找到指定数据，删除失败！");
        } else {
            for (int i = find(person.getName()); i < elems; i++) {
                Personarr[i] = Personarr[i + 1];
            }
            elems--;
        }
    }

    public void delete(String name) {
        if (find(name) == -1) {
            System.out.println("未查找到指定数据，删除失败！");
        } else {
            for (int i = find(name); i < elems; i++) {
                Personarr[i] = Personarr[i + 1];
            }
            elems--;
        }
    }

    public void change(Person oldperson, Person newperson) {
        if (find(oldperson.getName()) == -1) {
            System.out.println("未查找到指定数据，修改失败！");
        } else {
            Personarr[find(oldperson.getName())] = newperson;
        }
    }
}
