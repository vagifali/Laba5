package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertorPanel extends JPanel {
    private JTextField roubles;
    private JLabel jlb1, jlb2, result;
    public ConvertorPanel(){
        jlb1 = new JLabel("Введите значение в рублях");
        jlb2 = new JLabel("в долларах");
        result = new JLabel("------");
        roubles = new JTextField(5);
        roubles.addActionListener(new MyList());
        add(jlb1);
        add(roubles);
        add(jlb2);
        add(result);
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(300, 75));
    }
    private class MyList implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = roubles.getText();
            int roublesTemp = Integer.parseInt(text);
            int dollarTemp = (int)roublesTemp/78;
            result.setText(Integer.toString(dollarTemp));
        }
    }

}
