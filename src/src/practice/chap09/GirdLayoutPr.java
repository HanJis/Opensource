//실습9-4
package src.practice.chap09;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutPr extends JFrame {
    Color [] color = {Color.red,Color.orange,Color.yellow,Color.green,Color.cyan,Color.blue
            ,Color.magenta,Color.darkGray,Color.pink,Color.gray };
    public GirdLayoutPr() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        JButton[] list = new JButton[10];
        for(int i=0; i<10; i++) {
            list[i]= new JButton(Integer.toString(i));
            list[i].setBackground((color[i]));

            c.add(list[i]);
        }
        setSize(500, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GirdLayoutPr();
    }
}
