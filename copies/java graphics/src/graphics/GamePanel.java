package graphics;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;

    private GraphicsExample graphicsExample;

    public GamePanel() {
        // set the size
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // make the window focusable, otherwise, key events won't be triggered
        setFocusable(true);
        // add the key input handler
        addKeyListener(new KeyInputHandler());

        // create a new instance of the graphicsExample class
        graphicsExample = new GraphicsExample();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        graphicsExample.setPen(g2d);
        // clear the screen with white
        g2d.setPaint(Color.white);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        // set the pen color to black so that will be the default color of the graphicsExample render method
        g2d.setColor(new Color(255, 2, 3));
        // call the render method of the graphicsExample instance
        graphicsExample.render();
    }

    public void update() {
        // call the update method of the graphicsExample instance
        graphicsExample.update();
    }

    private class KeyInputHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("SPACE DOWN");
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("SPACE UP");
            }
        }
    }
}
