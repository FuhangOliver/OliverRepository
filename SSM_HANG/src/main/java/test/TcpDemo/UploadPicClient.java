package test.TcpDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadPicClient {
    public static void main(String[] args) throws IOException {
        System.out.println("上传图片客户端启动》》》》》》》》");
        //1，创建客户端，并指定地址和端口号
        Socket s = new Socket("127.0.0.1", 10008);

        //2，读取客户端图片文件
        FileInputStream fis = new FileInputStream("src\\main\\java\\test\\Resources\\Deskt.bmp");

        //3，获取socket流将图片数据发送到客户端
        OutputStream out = s.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        //3，告诉服务端传输完毕
        s.shutdownOutput();

        //4，接受服务端传输的数据
        //读取服务端发回的内容。
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];

        int lenIn = in.read(buf);
        String text = new String(buf, 0, lenIn);
        System.out.println(text);

        fis.close();
        s.close();
    }
}
