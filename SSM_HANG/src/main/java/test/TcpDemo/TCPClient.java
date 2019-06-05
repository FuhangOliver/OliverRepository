package test.TcpDemo;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10002);

        //OutputStream out = socket.getOutputStream();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        //读取服务端返回的数据,使用socket读取流。
        //4,socket输入流，读取服务端返回的大写数据
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line))
                break;

//			out.print(line+"\r\n");
//			out.flush();
            out.println(line);

            //读取服务端发回的一行大写数。
            String upperStr = bufIn.readLine();
            System.out.println(upperStr);
        }

        //关闭资源。
        socket.close();
    }
}
