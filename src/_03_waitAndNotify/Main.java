package _03_waitAndNotify;

import _03_waitAndNotify.Threads.Fruits;
import _03_waitAndNotify.Threads.Vegetables;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Fruits fruits = new Fruits(lock);
        Vegetables vegetables = new Vegetables(lock);
        fruits.start();
        vegetables.start();
    }
}

