package me.uquark.abp.labs;

import javax.swing.*;
import java.awt.*;

public class Lab4 {
    private static class DrawingPanel extends JComponent {
        public DrawingPanel() {
            setPreferredSize(new Dimension(300, 300));
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.RED);
            g.drawRect(50, 50, 200, 200);
            g.setColor(Color.GREEN);
            g.drawRect(100, 100, 100, 100);
            g.setColor(Color.BLUE);
            g.drawRect(125, 125, 50, 50);

            g.setFont(new Font(Font.SERIF, Font.ITALIC, 18));
            g.drawString("Бигдан А. И.", 100, 200);
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Лаба 4, Бигдан А. И.");
        jFrame.add(new DrawingPanel());
        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
