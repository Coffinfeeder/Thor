package Thor.Customizable;

import java.awt.*;
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
}