package _10_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ColorModel;

public class Okno3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setTitle("To nie jest pierwsze okno");

        JLabel label = new JLabel("Ja mam kota, ma na imię Gałgan");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.BOLD,40 ));
        label.setForeground(Color.magenta);

       // Color kolortla = Color.CYAN;
        //Color kolortla = new Color(1.0f, 1.0f,0.2f);
        //Color kolortla = new Color(255, 255, 150);
        Color kolortla = new Color(0x2CCAFF);
        label.setOpaque(true);
        label.setBackground(kolortla);


        frame.add(label);

        frame.setVisible(true);
    }

}
