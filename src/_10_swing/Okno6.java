package _10_swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Okno6 {
    private final Font FONT = new Font("Arial", Font.BOLD, 32);
    private final Dimension odstep = new Dimension(0, 10);
    private JFrame okno;
    private JPanel panel;
    private JLabel pytanie;
    private JTextField pole;
    private JButton guzik;
    private JLabel powitanie;
    private JButton guzik2;

    public static void main(String[] args) {
        new Okno6().run();
    }

    public void run() {
        przygotujWyglad();
        przygotujZdarzenia();
        wyswietl();

        System.out.println("okno wyświetlone, koniec main");
    }

    private void przygotujWyglad() {
        okno = new JFrame("Rozmowa");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        okno.setContentPane(panel); // panel jest wnętrzem okna

        // panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        LayoutManager layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        pytanie = new JLabel("Jak masz na imię?");
        pytanie.setFont(FONT);
        panel.add(pytanie);

        panel.add(Box.createRigidArea(odstep));

        pole = new JTextField();
        pole.setFont(FONT);
        pole.setForeground(Color.RED);
        panel.add(pole);

        panel.add(Box.createRigidArea(odstep));

        guzik = new JButton("OK");
        guzik.setFont(FONT);
        guzik.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        panel.add(guzik);

        panel.add(Box.createRigidArea(odstep));

        powitanie = new JLabel("Witaj");
        powitanie.setFont(FONT);
        powitanie.setForeground(Color.BLUE);
        panel.add(powitanie);

        panel.add(Box.createRigidArea(odstep));

        guzik2 = new JButton("Niespodzianka");
        guzik2.setFont(FONT);
        guzik2.setForeground(Color.RED);
        guzik2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        panel.add(guzik2);

        panel.add(Box.createRigidArea(odstep));
        okno.pack();
    }

    private void wyswietl() {
        okno.setVisible(true);
    }


    private void przygotujZdarzenia() {
        MojListener listener = new MojListener();
        guzik.addActionListener(listener);

        //klasa anonimowa
        guzik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String imie = pole.getText();
                powitanie.setText("Witaj " + imie + "!");
            }
        });

        // nowa składnia od Javy 8 - wyrazenia lambda

        guzik2.addActionListener(ev -> {
            int kolor = ThreadLocalRandom.current().nextInt(0x100000);
            guzik2.setForeground(new Color(kolor));

            int dx = ThreadLocalRandom.current().nextInt(100);
            int dy = ThreadLocalRandom.current().nextInt(100);

            okno.setLocation(okno.getX() + dx - 100,
                    okno.getY() + dy -100) ;

        });
    }
}


