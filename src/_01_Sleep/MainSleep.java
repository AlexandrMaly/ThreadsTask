package _01_Sleep;

import _01_Sleep.Threads.Fruits;
import _01_Sleep.Threads.Vegetables;

public class MainSleep {
    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        Vegetables vegetables = new Vegetables();
        fruits.start();
        vegetables.start();
    }
}
