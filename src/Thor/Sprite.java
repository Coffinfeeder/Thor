package Thor;

import java.awt.image.BufferedImage;

public class Sprite {
    private BufferedImage image;

    public Sprite(BufferedImage image) {
        this.image = image;
    }

    protected void setImage(BufferedImage image) {
        this.image = image;
    }

    protected BufferedImage getImage() {
        return image;
    }
}
