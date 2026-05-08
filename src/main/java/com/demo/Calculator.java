package com.demo;

import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JTextField t1, t2, result;
    JButton addButton;
    JFrame frame;

    public Calculator() {
        this(true);
    }

    public Calculator(boolean initializeGUI) {

        if (initializeGUI) {

            frame = new JFrame("Simple Calculator");

            frame.setSize(300, 200);
            frame.setLayout(null);

            JLabel l1 = new JLabel("Number 1");
            l1.setBounds(20, 20, 100, 30);
            frame.add(l1);

            t1 = new JTextField();
            t1.setBounds(120, 20, 100, 30);
            frame.add(t1);

            JLabel l2 = new JLabel("Number 2");
            l2.setBounds(20, 60, 100, 30);
            frame.add(l2);

            t2 = new JTextField();
            t2.setBounds(120, 60, 100, 30);
            frame.add(t2);

            addButton = new JButton("Add");
            addButton.setBounds(80, 100, 100, 30);
            addButton.addActionListener(this);
            frame.add(addButton);

            result = new JTextField();
            result.setBounds(80, 140, 100, 30);
            frame.add(result);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = add(num1, num2);

        result.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}