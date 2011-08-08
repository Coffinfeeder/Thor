import Examples.Wall;
import Thor.Game;
import Thor.Screen;
import Examples.Player;

class Runner {

    public static void main(String[] args) {
        Player player = new Player();

        player.setPosition(50, 50);

        Screen screen = new Screen(640, 480);
        screen.addObject("player", player);

        for (int y = 0; y < (screen.getHeight() / 32); y++) {
            if (y == 0 || y == (screen.getHeight() - 32) / 32) {
                for (int x = 0; x < screen.getWidth() / 32; x++) {
                    Wall w = new Wall();
                    w.setPosition(x * w.getWidth(), y * 32);
                    screen.addObject("wall-" + x + "_" + y, w);
                }
            } else {
                Wall w = new Wall();
                w.setPosition(0, y * 32);
                screen.addObject("wall-" + 0 + "_" + y, w);

                Wall w2 = new Wall();
                w2.setPosition(screen.getWidth() - 32, y * 32);
                screen.addObject("wall-" + ((screen.getWidth() - 32) / 32) + "_" + y, w2);
            }
        }

        Game game = new Game(screen);
        game.start();
    }
}