//실습10-2
package src.practice.chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Mouse extends JFrame {
    private JLabel la = new JLabel();

    public Mouse() {
        setTitle("드래깅 동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        MyMouseListener listener =
                new MyMouseListener();
        c.addMouseMotionListener(listener);
        c.add(la);
        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Container c = getContentPane();
            c.setBackground(Color.YELLOW);
        }

        public void mouseMoved(MouseEvent e) {
            Container c = getContentPane();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Mouse();
    }
}