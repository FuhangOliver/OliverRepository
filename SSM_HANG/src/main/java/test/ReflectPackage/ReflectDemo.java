package test.ReflectPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //implway();
        PropertierWay();
    }

    public static void PropertierWay() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Computer computer = new Computer();

        File file = new File("src\\main\\java\\test\\ReflectPackage\\PCI.properties");
        FileInputStream fis = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fis);

        for (int i = 0; i < prop.size(); i++) {
            String pciName = prop.getProperty("pci" + (i + 1));
            Class clazz = Class.forName(pciName);

            PCI pci = (PCI) clazz.newInstance();

            computer.usePci(pci);
        }
        fis.close();
    }

    public static void implway() {
        Computer computer = new Computer();
        computer.usePci(new NetCard());
    }
}
