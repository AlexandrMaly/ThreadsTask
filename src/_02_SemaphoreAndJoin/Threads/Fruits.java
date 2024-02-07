package _02_SemaphoreAndJoin.Threads;

import java.util.concurrent.Semaphore;

public class Fruits extends Thread {
    private Semaphore semaphore;
    private static String[] fruits = {"Apple", "Orange", "Cherry", "Plums", "Mango"};

    public Fruits(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            // Метод acquire здійснює запит на роботу. Якщо 0, то потік буде заблокований
            semaphore.acquire();
            for (String fruit : fruits) {
                System.out.println(fruit);
                Fruits.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}

