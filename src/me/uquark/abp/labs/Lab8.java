package me.uquark.abp.labs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Lab8 {
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
        JFrame jFrame = new JFrame("Лаба 8, Бигдан А. И.");

        ShapePanel shapePanel = new ShapePanel();

        JMenuBar menuBar = new JMenuBar();

        JMenu mnShapes = new JMenu("Фигуры");

        JMenuItem miTriangle = new JMenuItem("Треугольник");
        JMenuItem miRectangle = new JMenuItem("Прямоугольник");
        JMenuItem miEllipse = new JMenuItem("Эллипс");

        miTriangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        miRectangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        miEllipse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        mnShapes.add(miTriangle);
        mnShapes.add(miRectangle);
        mnShapes.add(miEllipse);

        menuBar.add(mnShapes);

        jFrame.setJMenuBar(menuBar);

        miTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Triangle;
                shapePanel.repaint();
            }
        });

        miRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Rectangle;
                shapePanel.repaint();
            }
        });

        miEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapePanel.mode = ShapePanel.Mode.Ellipse;
                shapePanel.repaint();
            }
        });

        jFrame.add(shapePanel);

        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}
