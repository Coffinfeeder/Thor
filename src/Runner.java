import Examples.Player;
import Thor.Customizable.*;

class Runner {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        player1.setPosition(50, 50);
        player2.setPosition(150, 50);

        Screen screen = new Screen(400, 400);
        screen.addObject(player1);
        screen.addObject(player2);
        Game game = new Game(screen);
        game.start();
    }
}