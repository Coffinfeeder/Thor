package Thor;

import java.awt.*;

public class Object {

    private Sprite currentSprite;

    private Point position;
    private Point previousPosition;

    public Object() {
        position = new Point();
        previousPosition = new Point();
        position.setLocation(0,0);
        previousPosition.setLocation(0,0);
        createAction();
    }

    public int getWidth() {
        return currentSprite.getWidth();
    }

    public int getHeight() {
        return currentSprite.getHeight();
    }

    public int getXPos() {
        return (int)position.getX();
    }

    public int getYPos() {
        return (int)position.getY();
    }

    public void setXPos(int x) {
        previousPosition.setLocation(getXPos(), getYPos());
        position.setLocation(x, getYPos());
    }

    public void setYPos(int y) {
        previousPosition.setLocation(getXPos(), getYPos());
        position.setLocation(getXPos(), y);
    }

    public void setPosition(int x, int y) {
        previousPosition.setLocation(getXPos(), getYPos());
        position.setLocation(x, y);
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
        g.drawImage(this.currentSprite.getImage(), getXPos(), getYPos(), null);
    }
}
