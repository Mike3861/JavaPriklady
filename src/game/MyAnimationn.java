package game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyAnimationn extends JPanel implements Runnable {
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;

    public MyAnimationn() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 30, 30);
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;
            if (x < 0 || x > getWidth() - 30) {
                dx *= -1;
            }
            if (y < 0 || y > getHeight() - 30) {
                dy *= -1;
            }
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) { }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("My Animation");
        MyAnimationn animation = new MyAnimationn();
        frame.add(animation);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread t = new Thread(animation);
        t.start();
    }
}