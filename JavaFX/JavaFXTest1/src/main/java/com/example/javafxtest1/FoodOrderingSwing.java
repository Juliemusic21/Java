package com.example.javafxtest1;

/*module com.example.javafxtest1 {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
}
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Food Ordering System - Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);

        //Create a label
        JLabel label = new JLabel("Order your food:");
        //Create a button
        JButton button = new JButton("Order Food");

        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Your order has been placed!");
        }
        });
        //Create panel and add components
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        //Adding panel to frame
        frame.getContentPane().add(panel);
        //Set frame visibility
        frame.setVisible(true);
        }
}