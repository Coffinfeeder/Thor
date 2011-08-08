package Thor;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Game extends JFrame implements KeyListener {
    private Screen currentScreen;
    private HashMap<Integer, Boolean> keyStates = new HashMap<Integer, Boolean>();

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
    }

    public void keyPressed(KeyEvent e) {

        keyStates.put(e.getKeyCode(), true);

        for (int keyCode : keyStates.keySet()) {
            if(keyStates.get(keyCode)) {
                currentScreen.keyAction(keyCode);
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        keyStates.remove(new Integer(e.getKeyCode()));
        currentScreen.keyReleasedAction(e.getKeyCode());
    }
}