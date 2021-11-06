//실습9-2
package src.practice.chap09;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPr extends JFrame {
    public BorderLayoutPr() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout(5, 7));
        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("West"), BorderLayout.WEST);
        setSize(400, 200); // 프레임 크기 300×200 설정
        setVisible(true); // 프레임을 화면에 출력
    }
    public static void main(String[] args) {
        new BorderLayoutPr();
    }
}