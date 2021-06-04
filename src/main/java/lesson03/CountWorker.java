package lesson03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountWorker implements Runnable {
    Count count;
    private ReentrantLock locker;

    public CountWorker(Count count, ReentrantLock lock) {
        this.count = count;
        locker = lock;
    }


    @Override
    public void run() {

        locker.lock();
        try {
            count.countdown();
            System.out.printf("%s %d \n", Thread.currentThread().getName(), count.getCount());
        } finally {
            locker.unlock();
        }
    }
}
