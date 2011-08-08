package Examples;

import Thor.Customizable.Object;
import Thor.Customizable.Sprite;

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

        setPosition(100, 100);
    }

}
