package _01_Sleep.Threads;

public class Fruits extends Thread {
    private static String[] fruits = {"Apple", "Orange", "Cherry", "Plums", "Mango"};

    public void run() {
        try {
            _01_Sleep.Threads.Vegetables.sleep(3000);
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

}
