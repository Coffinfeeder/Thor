package Thor;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    private Screen currentScreen;

    public Game(Screen initialScreen) {
        super("HackSlash");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        currentScreen = initialScreen;
        add(currentScreen);
        this.addKeyListener(this);
    }

    public void start() {
        pack();
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        currentScreen.keyPressedAction(e);
    }

    public void keyPressed(KeyEvent e) {
        currentScreen.keyAction(e);
    }

    public void keyReleased(KeyEvent e) {
        currentScreen.keyReleasedAction(e);
    }
}