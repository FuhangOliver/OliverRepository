package test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);

        new Thread(new Input(pis)).start();
        new Thread(new Output(pos)).start();
    }
}

class Input implements Runnable {
    private PipedInputStream in;

    Input(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {

        try {
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            String s = new String(bytes);
            System.out.println("s=" + s);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Output implements Runnable {
    private PipedOutputStream out;

    Output(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try {
            out.write("hi,管道来了！".getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}