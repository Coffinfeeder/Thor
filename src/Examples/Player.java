package Examples;

import Thor.Object;
import Thor.Sprite;
import Thor.SpriteFactory;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class Player extends Object {

    private Sprite down;
    private Sprite up;
    private Sprite left;
    private Sprite right;

    public Player() {
        super();
        try {
            down = SpriteFactory.fromRelativePath("Assets\\hero_down.png");
            up = SpriteFactory.fromRelativePath("Assets\\hero_up.png");
            left = SpriteFactory.fromRelativePath("Assets\\hero_left.png");
            right = SpriteFactory.fromRelativePath("Assets\\hero_right.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        setSprite(right);
        setPosition(0,0);
    }

    @Override
    public void keyAction(int keyCode) {
        if(keyCode == KeyEvent.VK_RIGHT) {
            setXPos(getXPos() + 10);
            setSprite(right);
        } else if(keyCode == KeyEvent.VK_LEFT) {
            setXPos(getXPos() - 10);
            setSprite(left);
        } else if(keyCode == KeyEvent.VK_UP) {
            setYPos(getYPos() - 10);
            setSprite(up);
        } else if(keyCode == KeyEvent.VK_DOWN) {
            setYPos(getYPos() + 10);
            setSprite(down);
        }
    }
}
