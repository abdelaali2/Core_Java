package q2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q2 {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("I'm Moving");
        Panel panel = new Panel();
        myFrame.setContentPane(panel);
        myFrame.setSize(1000, 500);
        myFrame.setVisible(true);
    }

}

class Panel extends JPanel implements Runnable {

    int x = 0;

    public Panel() {
        this.setBackground(Color.BLACK);
        this.setForeground(Color.GREEN);
        this.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 22));
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                x += 10;
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x > this.getWidth()) {
            x = 0;
        }
        g.drawString("Check me Out! I'm Mooooving :D", x, 400);
    }
}
