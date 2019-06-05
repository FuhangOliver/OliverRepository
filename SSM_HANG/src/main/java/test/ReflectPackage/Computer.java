package test.ReflectPackage;

public class Computer {
    public Computer() {
        System.out.println("Mycomputer run>>>>>>>>>>");
    }

    public void usePci(PCI pci) {
        pci.open();
        pci.close();
    }
}
