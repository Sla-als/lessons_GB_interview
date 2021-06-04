package lesson03;

import java.util.concurrent.locks.ReentrantLock;

public class MainApp {

    static Count count = new Count(); // для 2 задания

    public static void main(String[] args) throws InterruptedException {



        //1. Реализовать программу, в которой два потока поочередно пишут ping и pong.

        Game game = new Game(10);
        Pong pong = new Pong(game);
        Ping ping = new Ping(game);

        //  new Thread(ping).start();
        //  new Thread(pong).start();



        //2. Реализовать потокобезопасный счетчик с помощью интерфейса Lock.

        ReentrantLock locker = new ReentrantLock();
        CountWorker countWorker = new CountWorker(count,locker);

        for (int i = 0; i < 1000; i++) {
            new Thread(countWorker).start();
        }

    }

}
