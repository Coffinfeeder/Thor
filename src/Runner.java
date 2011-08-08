import Thor.Game;
import Thor.Screen;
import Examples.Player;

class Runner {

    public static void main(String[] args) {

        Player player = new Player();

        player.setPosition(50, 50);

        Screen screen = new Screen(400, 400);
        screen.addObject(player);
        Game game = new Game(screen);
        game.start();
    }
}