package Thor;

import java.awt.*;

public class Object {

    private Sprite currentSprite;

    private int xpos;
    private int ypos;

    public Object() {
        this.xpos = 0;
        this.ypos = 0;
        createAction();
    }

    public void setXPos(int x) {
        this.xpos = x;
    }

    public int getXPos() {
        return xpos;
    }

    public void setYPos(int y) {
        this.ypos = y;
    }

    public int getYPos() {
        return ypos;
    }

    public void setPosition(int x, int y) {
        setXPos(x);
        setYPos(y);
    }

    public void setSprite(Sprite sprite) {
        this.currentSprite = sprite;
    }

    // ======== actions ======== //

    public void createAction() {
    }

    public void keyPressedAction(int keyCode) {
    }

    public void keyAction(int keyCode) {
    }

    public void keyReleasedAction(int keyCode) {
    }

    public void paintAction(Graphics g) {
        g.drawImage(this.currentSprite.getImage(), this.xpos, this.ypos, null);
    }
}
