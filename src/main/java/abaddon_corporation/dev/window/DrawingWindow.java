package abaddon_corporation.dev.window;

import javax.swing.*;
import java.awt.*;

public class DrawingWindow extends JPanel {

    private Image backgroundImageWindow;

    public DrawingWindow() {
        backgroundImageWindow = new ImageIcon("src/main/resources/icon/background-brown-line.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImageWindow, 0, 0, getWidth(), getHeight(), this);
    }
}
