package abaddon_corporation.dev.window;

import javax.swing.*;

public class MainWindow {
    private JFrame mainWindow = new JFrame();
    private ImageIcon iconBrownLine = new ImageIcon("src/main/resources/icon/icon-brown-line.jpg");
    private DrawingWindow dw = new DrawingWindow();

    // Создание окна
    private void creatingWindow () {
        mainWindow.setTitle("Коричневая линия");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(800, 400);
        mainWindow.setIconImage(iconBrownLine.getImage());
        mainWindow.setContentPane(dw);
        mainWindow.setVisible(true);
    }

    // Добавление закрытых методов
    public void printWindow () {
        creatingWindow();
    }

}
