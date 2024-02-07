package _02_SemaphoreAndJoin;

import _02_SemaphoreAndJoin.Threads.Fruits;
import _02_SemaphoreAndJoin.Threads.Vegetables;

import java.util.concurrent.Semaphore;

/*
клас Маіn з використанням семафора для блокування виконання потоку фруктів та в подальшому його вивільнені.
 */

public class MainJoinSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
        Fruits fruits = new Fruits(semaphore);
        Vegetables vegetables = new Vegetables();
        fruits.start();
        vegetables.start();
        try {
            vegetables.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // вивільняю потік фруктів для його подальшої роботи
        semaphore.release();
    }


}

