package _03_waitAndNotify.Threads;

public class Fruits extends Thread {
    private final Object lock;
    private static String[] fruits = {"Apple", "Orange", "Cherry", "Plums", "Mango"};

    public Fruits(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            try {
                lock.wait(); // Зупиняю виведення потоку доки не буде викликано метод notify
                for (String fruit : fruits) {
                    System.out.println(fruit);
                    Fruits.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }

}
