package Examples;

import Thor.*;

import java.io.IOException;

public class Wall extends Thor.Object {

    public Wall() {
        super();
        try {
            setSprite(SpriteFactory.fromRelativePath("Assets/wall.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}