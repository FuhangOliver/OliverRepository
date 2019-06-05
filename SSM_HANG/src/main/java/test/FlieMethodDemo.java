package test;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class FlieMethodDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        String name = file.getName();
        String absPath = file.getAbsolutePath();
        String Path = file.getPath();
        long len = file.length();
        long time = file.lastModified();
        Date date = new Date(time);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String Str_time = dateFormat.format(date);
        System.out.println("name:" + name + ":::" + absPath + ":::" + Path + ":::" + len + ":::" + time);
        System.out.println("Str_time:" + Str_time);

    }
}
