package ru.mirea.lab4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {

    int sc1;
    int sc2;

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: " + sc1 + " X " + sc2);
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");

    gui() {
        super("Score");
        setLayout(null);
        setSize(475, 300);
        button1.setBounds(50, 50, 150, 30);
        button2.setBounds(250, 50, 150, 30);
        label1.setBounds(50, 100, 250, 30);
        label2.setBounds(50, 150, 250, 30);
        label3.setBounds(50, 200, 250, 30);
        add(button1);
        add(button2);
        add(label1);
        add(label2);
        add(label3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sc1++;
                label1.setText("Result: " + sc1 + " X " + sc2);
                label2.setText("Last Scorer: AC Milan");
                if (sc1 > sc2){
                    label3.setText("Winner: AC Milan");
                } else if (sc1 == sc2) {
                    label3.setText("Winner: DRAW");
                } else {
                    label3.setText("Winner: Real Madrid");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sc2++;
                label1.setText("Result: " + sc1 + " X " + sc2);
                label2.setText("Last Scorer: Real Madrid");
                if (sc1 > sc2){
                    label3.setText("Winner: AC Milan");
                } else if (sc1 == sc2) {
                    label3.setText("Winner: DRAW");
                } else {
                    label3.setText("Winner: Real Madrid");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args){
        new gui();
    }
}
