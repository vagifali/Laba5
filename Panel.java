package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private JTextField jta1;
    private JTextField jta2;
    private JLabel result;
    private JButton button;

    public Panel() {
        jta1 = new JTextField(5);
        jta2 = new JTextField(5);
        result = new JLabel("-------");
        button = new JButton("+");

        add(jta1);
        add(jta2);
        add(button);
        add(result);
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.YELLOW);

        button.addActionListener(new MyList());

    }

    private class MyList implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                double r = x1 + x2;
                JOptionPane.showMessageDialog(null, "Result = " + r, "Внимание", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Ошибка","Внимание",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}