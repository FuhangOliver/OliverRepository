package test;

import java.io.*;
import java.util.Properties;

public class GetAppCount {
    public static void main(String[] args) throws IOException {
        GetAppCountTest();
    }

    public static void GetAppCountTest() throws IOException {
        File Confile = new File("count.properties");
        if (!Confile.exists())
            Confile.createNewFile();
        FileInputStream fis = new FileInputStream(Confile);
        Properties properties = new Properties();
        properties.load(fis);
        String Value = properties.getProperty("time");
        int Count = 0;
        if (Value != null) {
            Count = Integer.parseInt(Value);
            if (Count >= 5) {
                throw new RuntimeException("试用次数已到，请充值！");
            }
        }
        Count++;
        properties.setProperty("time", Count + "");
        FileOutputStream fos = new FileOutputStream(Confile);
        properties.store(fos, "UseTimeCount");
        fis.close();
        fos.close();

    }
}
