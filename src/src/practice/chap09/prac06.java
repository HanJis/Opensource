package src.practice.chap09;

import javax.swing.*;
import java.awt.*;


public class prac06 extends JFrame{
    public prac06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        setSize(300, 300);
        for(int i = 0; i < 20; i++) {
            JLabel l = new JLabel(Integer.toString(i));
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;
            l.setLocation(x, y);
            l.setSize(10, 10);
            l.setOpaque(true);
            l.setBackground(Color.blue);
            c.add(l);
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new prac06();
    }

}
