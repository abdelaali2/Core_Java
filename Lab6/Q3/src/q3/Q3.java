package q3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q3 {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Bouncing Ball");
        Panel panel = new Panel();
        myFrame.setContentPane(panel);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
    }

}

class Panel extends JPanel implements Runnable {

    int x = 50;
    int y = 50;
    int dx = 10;
    int dy = 10;
    int width;
    int height;

    public Panel() {
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 22));
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x + dx > this.getWidth() - 20 || x + dx < 0) {
            dx = -dx;
            height = 40;
            width = 20;
        } else if (y + dy > this.getHeight() - 60 || y + dy < 0) {
            dy = -dy;
            height = 20;
            width = 40;
        } else {
            height = 30;
            width = 30;
        }
        x += dx;
        y += dy;

        g.drawOval(x, y, width, height);
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
        g.drawString("Bouncing Ball", 165, 450);
    }
}
