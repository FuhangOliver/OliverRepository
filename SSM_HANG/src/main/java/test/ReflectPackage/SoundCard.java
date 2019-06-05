package test.ReflectPackage;

public class SoundCard implements PCI {
    @Override
    public void open() {
        System.out.println("SoundCard open >>>>>>>>>>");
    }

    @Override
    public void close() {
        System.out.println("SoundCard close >>>>>>>>>>");
    }
}
