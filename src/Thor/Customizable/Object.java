package Thor.Customizable;

import java.awt.*;

public class Object {

    private Sprite currentSprite;

    private int xpos;
    private int ypos;

    public Object() {
        this.xpos = 0;
        this.ypos = 0;
    }

    public Object(Sprite sprite) {
        this();
        this.currentSprite = sprite;
    }

    public void setPosition(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }

    public void setSprite(Sprite sprite) {
        this.currentSprite = sprite;
    }

    // ======== actions ======== //

    public void paintAction(Graphics g) {
        g.drawImage(this.currentSprite.getImage(), this.xpos, this.ypos, null);
    }
}
