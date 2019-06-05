package test.TcpDemo;

import java.io.*;
import java.net.Socket;

public class UploadCilent {
    public static void main(String[] args) throws IOException {
        System.out.println("上传客客户端启动》》》》》》》》》》》");

        File file = new File("src\\main\\java\\test\\Resources\\javalist.txt");
        if (!file.exists())
            throw new RuntimeException("您要上传的文件不存在！");

        //1，创建客户端端口，包含地址信息和端口号。
        Socket s = new Socket("127.0.0.1", 10005);

        //2，创建读取本地文件的流
        BufferedReader bufr = new BufferedReader(new FileReader(file));

        //3，创建向服务端传输的流
        PrintWriter out = new PrintWriter(s.getOutputStream());

        String line = null;
        while ((line = bufr.readLine()) != null)
            out.println(line);
        //告诉服务端客户端写完了
        s.shutdownOutput();

        //4，读取服务端传输到客户端的流
        BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = bufin.readLine();
        System.out.println(str);

        bufr.close();
        s.close();
    }
}
