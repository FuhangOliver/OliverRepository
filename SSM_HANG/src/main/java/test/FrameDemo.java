package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("MyFrame");
//        f.setSize(500,400);
//        f.setLocation(400,150);
        f.setBounds(500, 300, 500, 400);
        f.setLayout(new FlowLayout());
        Button btn = new Button("付航");
        f.add(btn);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        System.out.println("over");
    }
}
