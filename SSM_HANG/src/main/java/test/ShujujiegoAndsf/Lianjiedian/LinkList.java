package test.ShujujiegoAndsf.Lianjiedian;

import java.lang.management.LockInfo;

public class LinkList {
    private Link first;

    public void insert(long value) {
        Link lnk = new Link(value);
        if (first == null) {
            first = lnk;
        } else {
            lnk.setNext(first);
            first = lnk;
        }
    }

    public void displayAll() {
        Link current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public Link find(long key) {
        Link current = first;
        while (current.getData() != key) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current;
    }
    //插入到指定节点位置

    public void insert(long value, int pos) {
        if (pos == 0) {
            insert(value);
        } else {
            Link current = first;
            for (int i = 0; i < pos - 1; i++) {
                current = current.getNext();
            }
            Link link = new Link(value);
            link.setNext(current.getNext());
            current.setNext(link);
        }
    }

    //删除指定节点
    public void delete(long key) {
        Link current = first;
        Link ago = first;
        while (current.getData() != key) {
            if (current.getNext() == null) {
                return;
            } else {
                ago = current;
                current = current.getNext();
            }
        }
        if (current == first) {
            first = first.getNext();
        } else {
            ago.setNext(current.getNext());
        }
    }
}
