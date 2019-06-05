package test;

public class GetFileName {
    private static String GetFileNameS(String FileName) {
        String temp[] = FileName.split("/");
        String fileNameNow = temp[temp.length - 1];
        return fileNameNow;
    }

    private static String GetFileFontName(String FileName) {
        if (FileName.indexOf(".") != -1) {
            String caselsh = FileName.substring(0, FileName.lastIndexOf("."));
            String[] strArray = FileName.split("\\.");
            int suffixIndex = strArray.length - 1;
            return caselsh + "\t" + strArray[suffixIndex];
        } else {
            return FileName + "\t" + "UNKNOWN";
        }
    }

    public static void main(String[] args) {
        String fileName = "/opt/sangfor/test";
        //System.out.println(GetFileNameS(fileName));
        System.out.println(GetFileFontName(GetFileNameS(fileName)));
    }
}
