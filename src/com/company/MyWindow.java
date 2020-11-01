package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MyWindow extends JFrame {
    public MyWindow() {
        super.setVisible(true);
        setLocation(750,350);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("Выход");
        add(btn1, BorderLayout.SOUTH);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });
        JButton btn2 = new JButton("Калькулятор");
        add(btn2, BorderLayout.NORTH);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Введите операци:");
                System.out.println("1.Сложение");
                System.out.println("2.Вычитание");
                System.out.println("3.Умножение");
                System.out.println("4.Деление");
                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();
                System.out.println("Введите 1 число");
                int a = scanner.nextInt();
                System.out.println("Введите 2 число");
                int b = scanner.nextInt();
                int result;
                if (operation == 1){
                    result = a + b;
                } else if (operation == 2) {
                    result = a - b;
                } else {
                    result = a * b;
                    if (operation == 4){
                        result = a/b;
                    }
                }
                System.out.println("результат "+result);
            }
        });
    }
}
