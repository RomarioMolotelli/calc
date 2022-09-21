import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class calc {
    private JFrame window;

    public calc() {
        window = new JFrame("Calculator");
        window.setSize(260, 340);
        window.setLocationRelativeTo(null);
        window.add(new Panel());
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new calc();
            }
        });


    }
}
