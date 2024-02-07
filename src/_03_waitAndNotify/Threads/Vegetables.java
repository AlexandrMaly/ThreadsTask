package _03_waitAndNotify.Threads;

public class Vegetables extends Thread {
    private final Object lock;
    private static String[] vegetables = {"Carrot", "Corn", "Tomatoes", "Pumpkin", "Cabbage"};

    public Vegetables(Object lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            for (String vegetable : vegetables) {
                System.out.println(vegetable);
                Vegetables.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Exception " + e.getMessage());
        }

        synchronized (lock) {
            lock.notify(); // викликаю даний метод для продовження виконання потоку фруктів
        }
    }

}
