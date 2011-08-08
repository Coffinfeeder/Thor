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

    public void keyPressedAction(int keyCode) {
        for(Object object : this.objects) {
            object.keyPressedAction(keyCode);
        }

        repaint();
    }

    public void keyAction(int keyCode) {
        for(Object object : this.objects) {
            object.keyAction(keyCode);
        }

        repaint();
    }

    public void keyReleasedAction(int keyCode) {

        for(Object object : this.objects) {
            object.keyReleasedAction(keyCode);
        }

        repaint();
    }
}