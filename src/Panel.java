import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {
    int i = 0, k = 10, sum = 0, dif = 0, mut = 0, div = 0;
    String j, h;
    int a, b;
    private final JButton[] num = new JButton[10];
    private Font font = new Font("Times New Roman", Font.BOLD, 20);

    public Panel() {
        setLayout(null);
        setFocusable(true);
        grabFocus();

        num[0] = new JButton("0");
        num[0].setBounds(70, 250, 50, 50);
        num[0].setFont(font);
        add(num[0]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i + 1 + j * 3] = new JButton((i + 1 + j * 3) + " ");
                num[i + 1 + j * 3].setBounds(i * (50 + 10) + 10, j * (50 + 10) + 70, 50, 50);
                num[i + 1 + j * 3].setFont(font);
                add(num[i + 1 + j * 3]);
            }
        }
        JButton plus = new JButton("+");
        plus.setBounds(190, 70, 50, 50);
        add(plus);
        plus.setFont(font);
        JButton minus = new JButton("-");
        minus.setBounds(190, 130, 50, 50);
        add(minus);
        minus.setFont(font);
        JButton multiply = new JButton("*");
        multiply.setBounds(190, 190, 50, 50);
        add(multiply);
        multiply.setFont(font);
        JButton divide = new JButton("/");
        divide.setBounds(190, 250, 50, 50);
        add(divide);
        divide.setFont(font);
        JButton equal = new JButton("=");
        equal.setBounds(130, 250, 50, 50);
        add(equal);
        equal.setFont(font);
        //JButton zero = new JButton("0"); zero.setBounds(70,250,50,50); add(zero); zero.setFont(font);
        JButton reset = new JButton("C");
        reset.setBounds(10, 250, 50, 50);
        add(reset);
        reset.setFont(font);

        JTextField text = new JTextField("");
        text.setBounds(10, 10, 230, 50);
        text.setFont(font);
        text.setEditable(false);
        add(text);

        ActionListener l = (ActionEvent e) -> {
            JButton g = (JButton) e.getSource();
            text.setText(text.getText() + g.getText());

        };

        for (JButton g : num) {
            g.addActionListener(l);
        }
        ActionListener Calculation = (ActionEvent e) -> {
            if (e.getSource() == reset) {
                text.setText(null);
                i = 0;
            }
            if (e.getSource() == equal) {
                h = text.getText();
                b = Integer.parseInt(h);
                a = Integer.parseInt(j);
                if (sum == 1) {
                    text.setText(a + b + "");
                    sum = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (dif == 1) {
                    text.setText(a - b + "");
                    dif = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (mut == 1) {
                    text.setText(a * b + "");
                    mut = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (div == 1) {
                    text.setText(a / b + "");
                    div = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";

                }
                if (e.getSource() == plus) {
                    j = text.getText();
                    text.setText(null);
                    sum++;
                }
                if (e.getSource() == minus) {
                    j = text.getText();
                    text.setText(null);
                    dif++;
                }
                if (e.getSource() == multiply) {
                    j = text.getText();
                    text.setText(null);
                    mut++;
                }
                if (e.getSource() == divide) {
                    j = text.getText();
                    text.setText(null);
                    div++;
                }


            }
        };
        reset.addActionListener(Calculation);
        plus.addActionListener(Calculation);
        minus.addActionListener(Calculation);
        multiply.addActionListener(Calculation);
        divide.addActionListener(Calculation);
        equal.addActionListener(Calculation);
        text.addActionListener(Calculation);

/*
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();

                if (!Character.isDigit(symbol))
                    return;

                text.setText(text.getText() + symbol);
            }

        });

*/
    }

}





