package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setTitle("To nie jest pierwsze okno");

        LayoutManager layout = new FlowLayout();
        frame.setLayout(layout);

        JLabel label = new JLabel("Jak Twój dzień?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.BOLD,40 ));
        label.setForeground(Color.magenta);
        Color kolortla = new Color(0x2CCAFF);
        label.setOpaque(true);
        label.setBackground(kolortla);
        frame.add(label);

        JButton button = new JButton("OK");
        button.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(button);

        JButton button2 = new JButton("NIE OK");
        button2.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(button2);

        JButton button3 = new JButton("W CHUJ NIE OK");
        button3.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(button3);

        JButton button4 = new JButton("JEB SIE");
        button4.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(button4);

        frame.setVisible(true);
    }

}
