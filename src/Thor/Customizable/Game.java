package Thor.Customizable;

import sun.java2d.ScreenUpdateManager;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    private Screen currentScreen;

    public Game(Screen initialScreen) {
        super("HackSlash");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(initialScreen);
        pack();
        setVisible(true);
    }
}