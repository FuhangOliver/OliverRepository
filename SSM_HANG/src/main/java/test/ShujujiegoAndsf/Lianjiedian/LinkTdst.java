package test.ShujujiegoAndsf.Lianjiedian;

public class LinkTdst {
    public static void main(String[] args) {

        Link link1 = new Link(10);
        Link link2 = new Link(11);
        Link link3 = new Link(12);
        Link link4 = new Link(13);
        Link link5 = new Link(14);


        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);
        link4.setNext(link5);

        System.out.println(link1.getNext().getData());

    }
}
