package test.ShujujiegoAndsf.Lianjiedian;

public class Link {
    private long data;
    private Link link;

    public Link(long data) {
        this.data = data;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Link getNext() {
        return link;
    }

    public void setNext(Link link) {
        this.link = link;
    }
}
