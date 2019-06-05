package test.UdpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPRecieveDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("接收端启动......");
        DatagramSocket ds = new DatagramSocket(10000);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            String text = new String(dp.getData(), 0, dp.getLength());

            System.out.println(ip + ":" + port + ":" + text);
        }

        //ds.close();
    }
}
