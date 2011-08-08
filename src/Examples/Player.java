package Examples;

import Thor.Object;
import Thor.Sprite;

import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class Player extends Object {

    private Sprite defaultSprite;

    public Player() {
        super();

        URL u = getClass().getProtectionDomain().getCodeSource().getLocation();
        File f = null;
        try {
            f = new File(u.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        defaultSprite = new Sprite(f.getParent()+"\\assets\\geoffrey_trolling.png");

        setSprite(defaultSprite);
        setPosition(0,0);
    }

    @Override
    public void keyAction(int keyCode) {
        if(keyCode == KeyEvent.VK_RIGHT) {
            setXPos(getXPos() + 10);
        } else if(keyCode == KeyEvent.VK_LEFT) {
            setXPos(getXPos() - 10);
        } else if(keyCode == KeyEvent.VK_UP) {
            setYPos(getYPos() - 10);
        } else if(keyCode == KeyEvent.VK_DOWN) {
            setYPos(getYPos() + 10);
        }
    }
}
