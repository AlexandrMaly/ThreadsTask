package _02_SemaphoreAndJoin.Threads;

public class Vegetables extends Thread {

    private static String[] vegetables = {"Carrot", "Corn", "Tomatoes", "Pumpkin", "Cabbage"};

    public void run() {
        for (String vegetable : vegetables) {
            try {
                System.out.println(vegetable);
                Vegetables.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }
}
