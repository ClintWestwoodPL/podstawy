package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setTitle("To nie jest pierwsze okno");

        JLabel label = new JLabel("Ja mam kota, ma na imię Gałgan");
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
       // frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

}
