package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameFrame extends JFrame implements ActionListener {
    GamePanel gamePanel;

    public GameFrame(String title) {
        gamePanel = new GamePanel();

        add(gamePanel);
        pack();

        setTitle(title);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int frameRate = 1000 / 60;
        new Timer(frameRate, this).start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gamePanel.update();
        gamePanel.repaint();
    }
}
