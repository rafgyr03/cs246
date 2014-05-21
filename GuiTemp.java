package guitemp;

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class GuiTemp extends JPanel {
    @Override
    public void paint(Graphics g) {
        Color crimson = new Color(220,20,60);
        g.setColor(crimson);
        g.fillRect(5,5,50,100);
        Color miku = new Color(86,210,199);
        g.setColor(miku);
        g.fillRoundRect(80,5,100,100,45,45);
        Color murasaki = new Color(64,0,64,200);
        g.setColor(murasaki);
        g.fillOval(200, 5, 100, 100);
         try {
            TranspCursor curs = new TranspCursor();
            curs.createCurs();
        } catch (Exception ex) {
            System.err.println("Error");
        }
    }

    public static void main(String[] args) throws Exception{
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setContentPane(new GuiTemp());
        f.setSize(320,150);
        f.setVisible(true);
    }
}
//http://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/event/WindowEvent.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/event/WindowAdapter.html
//http://docs.oracle.com/javase/7/docs/api/javax/swing/JPanel.html
//http://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html