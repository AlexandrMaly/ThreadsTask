package _01_Sleep.Threads;

public class Vegetables extends Thread {

    private static String[] vegetables = {"Carrot", "Corn", "Tomatoes", "Pumpkin", "Cabbage"};

    public void run() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
