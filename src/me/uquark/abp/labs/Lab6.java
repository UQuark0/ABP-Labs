package me.uquark.abp.labs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6 {
    private static class ShapePanel extends JComponent {
        public enum Mode {
            Triangle,
            Rectangle,
            Ellipse,
            None
        }

        public Mode mode = Mode.None;

        public ShapePanel() {
            setPreferredSize(new Dimension(300, 300));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);

            switch (mode) {
                case Triangle:
                    g.fillPolygon(new int[]{50, 250, 150}, new int[]{50, 50, 250}, 3);
                    break;
                case Rectangle:
                    g.fillRect(50, 50, 200, 200);
                    break;
                case Ellipse:
                    g.fillOval(25, 75, 250, 150);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Лаба 6, Бигдан А. И.");

        JPanel mainPanel = new JPanel();
        ShapePanel shapePanel = new ShapePanel();
        JPanel buttonPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JButton btTriangle = new JButton("Треугольник");
        JButton btRectangle = new JButton("Прямоугольник");
        JButton btEllipse = new JButton("Эллипс");

        btTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Triangle;
                shapePanel.repaint();
            }
        });

        btRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Rectangle;
                shapePanel.repaint();
            }
        });

        btEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Ellipse;
                shapePanel.repaint();
            }
        });

        buttonPanel.add(btTriangle);
        buttonPanel.add(btRectangle);
        buttonPanel.add(btEllipse);

        mainPanel.add(buttonPanel);
        mainPanel.add(shapePanel);

        jFrame.add(mainPanel);

        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}
