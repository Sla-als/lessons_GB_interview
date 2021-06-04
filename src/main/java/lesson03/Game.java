package lesson03;

public class Game {

    int rounds;

    public Game(int rounds) {
        this.rounds = rounds;
    }

    public synchronized void ping() {
        for (int i = 0; i < rounds; i++) {
            try {
                notify();
                System.out.println("PING");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void pong() {
        for (int i = 0; i < rounds; i++) {
            try {
                notify();
                System.out.println("PONG");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
