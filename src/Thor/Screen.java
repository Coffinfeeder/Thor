package Thor;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Screen extends Canvas {

    private ArrayList<Object> objects;

    public Screen(int width, int height) {
        setSize(width, height);
        this.objects = new ArrayList<Object>();
    }

    public void addNotify() {
        super.addNotify();
        createBufferStrategy(2);
    }

    public void addObject(Object object) {
        this.objects.add(object);
    }

    public void paint(Graphics g) {
        for(Object object : this.objects) {
            object.paintAction(g);
        }
    }

    public void keyPressedAction(KeyEvent e) {
        for(Object object : this.objects) {
            object.keyPressedAction(e.getKeyCode());
        }

        repaint();
    }

    public void keyAction(KeyEvent e) {
        for(Object object : this.objects) {
            object.keyAction(e.getKeyCode());
        }

        repaint();
    }

    public void keyReleasedAction(KeyEvent e) {

        for(Object object : this.objects) {
            object.keyReleasedAction(e.getKeyCode());
        }

        repaint();
    }
}