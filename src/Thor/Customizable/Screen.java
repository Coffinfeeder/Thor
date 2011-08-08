package Thor.Customizable;

import java.awt.*;

public class Screen extends Canvas {

    public Screen(int width, int height) {
        setSize(width, height);
    }

    public void addNotify() {
        super.addNotify();
        createBufferStrategy(2);
    }

    public void paint(Graphics g) {
        g.drawRect(10,10, 240, 120);
    }
}