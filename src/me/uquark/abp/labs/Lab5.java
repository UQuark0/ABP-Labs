package me.uquark.abp.labs;

import javax.swing.*;
import java.awt.*;

public class Lab5 {
    private static class SpanLabel extends JLabel {
        public SpanLabel(String text) {
            super(text);
            setPreferredSize(new Dimension(200, 20));
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Лаба 5, Бигдан А. И.");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 2));

        SpanLabel lbPaper = new SpanLabel("Наименование бумаги");
        SpanLabel lbProduct = new SpanLabel("Название продукции");
        SpanLabel lbFormat = new SpanLabel("Формат бумаги");
        SpanLabel lbInk = new SpanLabel("Вид чернил");
        SpanLabel lbSheets = new SpanLabel("Количество листов");
        SpanLabel lbCopies = new SpanLabel("Количество экземпляров");
        SpanLabel lbFaces = new SpanLabel("Количество сторон");
        SpanLabel lbMasterFilm = new SpanLabel("Количество мастер плёнки");

        JComboBox<String> cbPaper = new JComboBox<String>();
        JComboBox<String> cbProduct = new JComboBox<String>();
        JComboBox<String> cbFormat = new JComboBox<String>();
        JComboBox<String> cbInk = new JComboBox<String>();
        JComboBox<String> cbFaces = new JComboBox<String>();

        JTextField tfSheets = new JTextField();
        JTextField tfCopies = new JTextField();
        JTextField tfMasterFilm = new JTextField();

        mainPanel.add(lbPaper);
        mainPanel.add(cbPaper);

        mainPanel.add(lbProduct);
        mainPanel.add(cbProduct);

        mainPanel.add(lbFormat);
        mainPanel.add(cbFormat);

        mainPanel.add(lbInk);
        mainPanel.add(cbInk);

        mainPanel.add(lbSheets);
        mainPanel.add(tfSheets);

        mainPanel.add(lbCopies);
        mainPanel.add(tfCopies);

        mainPanel.add(lbFaces);
        mainPanel.add(cbFaces);

        mainPanel.add(lbMasterFilm);
        mainPanel.add(tfMasterFilm);

        jFrame.add(mainPanel);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
