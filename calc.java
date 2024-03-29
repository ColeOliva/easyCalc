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

        // initializing popup window
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setLocationRelativeTo(null);

        // first number panel - prompting and entering a number
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter First Number");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        panel.add(label);
        panel.add(tf);

        // second number panel
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Enter Second Number");
        JTextField tf2 = new JTextField(10); // accepts upto 10 characters
        panel2.add(label2);
        panel2.add(tf2);

        // the panel with the calculation buttons
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

        JButton[] operation = new JButton[]{add, subtract, multiply, divide};

        // adding an action to each button if pressed
        for (int i = 0; i < operation.length; i++) {
            JButton op = operation[i];
            op.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String num = tf.getText();
                    String num2 = tf2.getText();
                    Integer first = Integer.parseInt(num);
                    Integer second = Integer.parseInt(num2);

                    double total = 0;
                    if (op.equals(add)) {
                        total = first + second;
                    } else if (op.equals(subtract)) {
                        total = first - second;
                    } else if (op.equals(multiply)) {
                        total = first * second;
                    } else if (op.equals(divide)) {
                        total = 1.0 * first / second;
                    }

                    JOptionPane.showMessageDialog(frame, "The total is: " + total);
                }
            });
        }
    }
}