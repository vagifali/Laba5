package lab5;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* ConvertorPanel pan = new ConvertorPanel();
        frame.getContentPane().add(pan);
        frame.setPreferredSize(new Dimension(200,300));
        frame.pack();
        frame.setVisible(true); */


        Panel p = new Panel();
        frame.getContentPane().add(p);
        frame.setPreferredSize(new Dimension(200,300));
        frame.pack();
        frame.setVisible(true);
    }
}