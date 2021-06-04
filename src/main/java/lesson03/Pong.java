package lesson03;

public class Pong implements Runnable {
    Game game;

    public Pong(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
            game.pong();
    }
}
