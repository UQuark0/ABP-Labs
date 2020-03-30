package me.uquark.abp.labs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab7 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Лаба 7, Бигдан А. И.");
        JFrame frResult = new JFrame("Результат");

        JLabel lbQuestion = new JLabel("Объединение алгоритма и данных в ООП это:");

        JButton btIncorrectAnswer1 = new JButton("Полиморфизм");
        JButton btIncorrectAnswer2 = new JButton("Наследование");
        JButton btIncorrectAnswer3 = new JButton("Абстракция");
        JButton btCorrectAnswer = new JButton("Инкапсуляция");

        JLabel lbResult = new JLabel();

        ActionListener alIncorrect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lbResult.setText("Неверно");
                frResult.pack();
                frResult.setLocationRelativeTo(jFrame);
                frResult.setVisible(true);
            }
        };

        ActionListener alCorrect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lbResult.setText("Верно");
                frResult.pack();
                frResult.setLocationRelativeTo(jFrame);
                frResult.setVisible(true);
            }
        };

        btIncorrectAnswer1.addActionListener(alIncorrect);
        btIncorrectAnswer2.addActionListener(alIncorrect);
        btIncorrectAnswer3.addActionListener(alIncorrect);
        btCorrectAnswer.addActionListener(alCorrect);

        JPanel mainPanel = new JPanel();
        JPanel questionPanel = new JPanel();
        JPanel answerPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        answerPanel.setLayout(new GridLayout(2, 2));

        questionPanel.add(lbQuestion);
        answerPanel.add(btIncorrectAnswer1);
        answerPanel.add(btIncorrectAnswer2);
        answerPanel.add(btCorrectAnswer);
        answerPanel.add(btIncorrectAnswer3);

        mainPanel.add(questionPanel);
        mainPanel.add(answerPanel);

        jFrame.add(mainPanel);

        frResult.add(lbResult);
        frResult.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frResult.setResizable(false);

        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
