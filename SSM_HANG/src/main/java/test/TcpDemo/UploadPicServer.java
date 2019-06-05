package test.TcpDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {
    public static void main(String[] args) throws IOException {
        System.out.println("上传图片服务端启动》》》》》》》》");
        //1，创建TCP的Socket服务端
        ServerSocket ss = new ServerSocket(10008);
        while (true) {
            //2，获取客户端
            Socket s = ss.accept();
            new Thread(new UploadTask(s)).start();
        }
    }
}
