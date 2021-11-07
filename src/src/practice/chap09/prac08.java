package src.practice.chap09;

import javax.swing.*;
import java.awt.*;
class N extends JPanel{
    public N() {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);
        setOpaque(true);
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}
class C extends JPanel {
    public C() {
        setBackground(Color.white);
        setLayout(null);
        for(int i = 0; i < 10; i++) {
            JLabel label = new JLabel("*");
            int x = (int)(Math.random()*200) + 10;
            int y = (int)(Math.random()*200) + 10;
            label.setLocation(x, y);
            label.setSize(30, 30);
            setOpaque(true);
            add(label);
        }
    }
}
class S extends JPanel {
    public S() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.YELLOW);
        setOpaque(true);
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}
public class prac08 extends JFrame{
    public prac08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.add(new N(), BorderLayout.NORTH);
        c.add(new C(), BorderLayout.CENTER);
        c.add(new S(), BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new prac08();
    }

}
