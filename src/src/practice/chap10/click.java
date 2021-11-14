//실습10-6
package src.practice.chap10;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class click extends JFrame{
    JLabel la= new JLabel("C");
    click(){
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la.addMouseListener(new MyMouseAdapter());
        setLayout(null);
        la.setSize(50,20);
        la.setLocation(100,100);
        add(la);
        setSize(300,300);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*200);
            y = (int)(Math.random()*200);
            la.setLocation(x,y);
        }
    }
    public static void main(String[] args) {
        new click();
    }

}
