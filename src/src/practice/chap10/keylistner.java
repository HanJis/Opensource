//실습10-4
package src.practice.chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class keylistner extends JFrame{
    JLabel la;
    String text = "Love Java";
    keylistner(){
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        la= new JLabel("Love Java");
        c.addKeyListener(new MyKeyAdapter());
        c.add(la);
        c.setSize(150,75);
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();

    }
    class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT)  {
                    la.setText(text);
                    text = text.substring(1)+text.substring(0, 1);
            }
        }
    }
    public static void main(String [] args) {
        new keylistner();
    }
}
