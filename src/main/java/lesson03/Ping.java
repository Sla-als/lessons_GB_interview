package lesson03;

public class Ping implements Runnable {
    Game game;

    public Ping(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
            game.ping();
    }
}

