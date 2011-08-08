package Thor.Customizable;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Sprite {
    private BufferedImage image;

    public Sprite(String path) {
        try {
            this.image = ImageIO.read(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected BufferedImage getImage() {
        return image;
    }
}
