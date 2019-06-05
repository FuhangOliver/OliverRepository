package test.TcpDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        System.out.println("文件传输服务端开启》》》》");
        //1，创建服务端，并指定监听的端口号
        ServerSocket ss = new ServerSocket(10005);

        //2，创建Socket对象接受服务端对象
        Socket s = ss.accept();

        System.out.println(s.getInetAddress().getHostAddress() + "connected>>>>>>>>>>>");

        //3，创建接受客户端传输流的流
        BufferedReader bufrin = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //4，创建写入本地文件的流
        BufferedWriter bufw = new BufferedWriter(new FileWriter("src\\main\\java\\test\\Resources\\server.txt"));
        //接受客户端传输文件，并写入本地
        String line = null;
        while ((line = bufrin.readLine()) != null) {
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        //5，向客户端发送上传成功信息
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("上传成功！");

        bufw.close();
        s.close();
        ss.close();
    }
}
