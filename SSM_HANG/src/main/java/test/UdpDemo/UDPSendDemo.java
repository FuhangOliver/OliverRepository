package test.UdpDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        //UDPSendSimple();
        UDPSendKeyboard();
    }

    private static void UDPSendKeyboard() throws IOException {
        System.out.println("发送端启动......");
        /*
         * 创建UDP传输的发送端。
         * 思路：
         * 1，建立udp的socket服务。
         * 2，将要发送的数据封装到数据包中。
         * 3，通过udp的socket服务将数据包发送出去。
         * 4，关闭socket服务。
         */
        //1,udpsocket服务。使用DatagramSocket对象。
        DatagramSocket ds = new DatagramSocket(8888);


//		String str = "udp传输演示：哥们来了！";
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = bufr.readLine()) != null) {


            byte[] buf = line.getBytes();
            DatagramPacket dp =
                    new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
            ds.send(dp);

            if ("886".equals(line))
                break;
        }

        //4，关闭资源。
        //ds.close();
    }

    public static void UDPSendSimple() throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String str = "接收端您好！我是发送端！付航来了！";

        byte[] buf = str.getBytes();

        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.1.1.100"), 10000);

        ds.send(dp);

        ds.close();
    }
}
