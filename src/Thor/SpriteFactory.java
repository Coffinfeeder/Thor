package Thor;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SpriteFactory {
    public static Sprite fromRelativePath(String relativePath) throws IOException {
        String path = new File(".").getCanonicalPath() + "\\" + relativePath;
        return new Sprite(ImageIO.read(new FileInputStream(path)));
    }
}
