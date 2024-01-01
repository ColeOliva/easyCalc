/*
 * Author: Cole Oliva
 * Date: 12/2023
 * Purpose: the first of hopefully many projects, gaining experience with coding. 
 */

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);

        // first number panel
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter First Number");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Enter Second Number");
        JTextField tf2 = new JTextField(10); // accepts upto 10 characters
        panel2.add(label2); // Components Added using Flow Layout
        panel2.add(tf2);

        JPanel panel3 = new JPanel();
        JButton add = new JButton("add");
        JButton subtract = new JButton("subtract");
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("divide");
        panel3.add(add);
        panel3.add(subtract);
        panel3.add(multiply);
        panel3.add(divide);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.getContentPane().add(BorderLayout.AFTER_LAST_LINE, panel3);
        frame.setVisible(true);

        add.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String num = tf.getText();
                String num2 = tf2.getText();
                Integer first = Integer.parseInt(num);
                Integer second = Integer.parseInt(num2);
                JOptionPane.showMessageDialog(frame, first + second);
            }
        });
    }
}