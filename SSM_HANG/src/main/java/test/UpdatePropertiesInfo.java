package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class UpdatePropertiesInfo {
    public static void main(String[] args) throws IOException {
        UpdateProperties();
    }

    public static void UpdateProperties() throws IOException {
        File file = new File("jdbc.txt");
        if (!file.exists())
            file.createNewFile();
        FileReader fr = new FileReader(file);
        Properties properties = new Properties();
        properties.load(fr);
        properties.setProperty("maxIdle", "21");
        FileWriter fw = new FileWriter(file);
        properties.store(fw, "");

        fr.close();
        fw.close();

        properties.list(System.out);

    }
}
