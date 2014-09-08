package seven;

/**
 * Created by acer on 14-8-14.
 */
class Game {
    Game(int i) {
        System.out.print("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame{
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}
