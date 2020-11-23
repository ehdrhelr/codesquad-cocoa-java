package day16.test;

import java.awt.*;

public class ButtonTest {

    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Button b = new Button("클릭");
        b.setSize(100, 50);
        b.setLocation(100,75);

        f.add(b);
        f.setVisible(true);

    }
}
