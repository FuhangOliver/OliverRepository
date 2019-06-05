package test.TcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Mytomcat {
    public static void main(String[] args) throws IOException {

        System.out.println("Mytomcat开启！");
        ServerSocket ss = new ServerSocket(9090);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + ".......connected");

        InputStream in = s.getInputStream();

        byte buf[] = new byte[1024];
        int len = in.read(buf);
        String str = new String(buf, 0, len);
        System.out.println("收到：" + str);

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        out.println("欢迎光临！");

        s.close();
        ss.close();
    }
}
