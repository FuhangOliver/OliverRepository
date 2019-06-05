package test.ReflectPackage;

public class NetCard implements PCI {
    @Override
    public void open() {
        System.out.println("NetCard open >>>>>>>>>");
    }

    @Override
    public void close() {
        System.out.println("NetCard close >>>>>>>>>");
    }
}
