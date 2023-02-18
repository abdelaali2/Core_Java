package q1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q1 {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Simple Clock");
        Panel panel = new Panel();
        myFrame.setContentPane(panel);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
    }

}

class Panel extends JPanel implements Runnable {

    public Panel() {
        this.setBackground(Color.BLACK);
        this.setForeground(Color.GREEN);
        this.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 28));
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            this.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 100, 100);
    }
}
