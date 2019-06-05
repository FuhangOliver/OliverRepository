package test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        MethodDemo();
    }

    public static void MethodDemo() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src\\main\\resources\\jdbc.properties");
        prop.load(fis);
        prop.list(System.out);
        FileOutputStream fos = new FileOutputStream("jdbc.txt");
        prop.store(fos, "jdbcProperties");
        fis.close();
        fos.close();
    }
}
