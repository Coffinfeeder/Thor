package Thor;

import java.io.File;
import java.io.IOException;

public class SpriteFactory {
    public static Sprite fromRelativePath(String relativePath) throws IOException {
        String path = new File(".").getCanonicalPath() + "\\" + relativePath;
        return new Sprite(path);
    }
}
