package test;

import java.util.Properties;
import java.util.Set;

public class GetSystemProperties {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        //Properties pro = GetProperties();
        System.out.println("付" + LINE_SEPARATOR + "hang");
    }

    public static Properties GetProperties() {
        Properties prop = System.getProperties();
        Set<String> Key = prop.stringPropertyNames();
        for (String name : Key) {
            String Value = prop.getProperty(name);
            System.out.println(name + "::" + Value);
        }
        return prop;
    }
}
