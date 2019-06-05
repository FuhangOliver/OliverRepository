package test.TcpDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTask implements Runnable {
    private Socket s;

    public UploadTask(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "connected>>>>>>>>>>>>");
        try {
            //3，读取客户端发送过来的数据流
            InputStream in = s.getInputStream();
            //4，将读取到的数据存储到本地文件中
            File dir = new File("src\\main\\java\\test\\Resources");
            if (!dir.exists())
                dir.mkdirs();
            File file = new File(dir, ip + ".bmp");

            //如果文件已经存在于服务端
            int count = 0;
            while (file.exists()) {
                file = new File(dir, ip + "(" + (++count) + ").jpg");
            }
            FileOutputStream fos = new FileOutputStream(new File(file, ip + ".bmp"));

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != 0)
                fos.write(buf, 0, len);
            //5，向客户发送上传成功信息
            OutputStream out = s.getOutputStream();
            out.write("上传成功".getBytes());

            fos.close();
            s.close();
        } catch (Exception e) {
        }
    }
}
