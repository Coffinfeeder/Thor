package Thor;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Screen extends Canvas {

    private HashMap<String, Object> objects;

    public Screen(int width, int height) {
        setSize(width, height);
        this.objects = new HashMap<String, Object>();
    }

    public void addNotify() {
        super.addNotify();
        createBufferStrategy(2);
    }

    public void addObject(String handle, Object object) {
        this.objects.put(handle, object);
    }

    public void gameTick() {
         for(Object object : this.objects.values()) {
            object.gameTickAction();
        }
    }

    public void paint(Graphics g) {
        for(Object object : this.objects.values()) {
            object.paintAction(g);
        }
    }

    public void keyPressedAction(int keyCode) {
        for(Object object : this.objects.values()) {
            object.keyPressedAction(keyCode);
        }

        repaint();
    }

    public void keyAction(int keyCode) {
        for(Object object : this.objects.values()) {
            object.keyAction(keyCode);
        }

        repaint();
    }

    public void keyReleasedAction(int keyCode) {

        for(Object object : this.objects.values()) {
            object.keyReleasedAction(keyCode);
        }

        repaint();
    }
}