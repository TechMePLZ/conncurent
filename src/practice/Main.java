package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> list = new LinkedList<>();

        Thread consumerThread = new Thread(new ConsumerThread(list));
        Thread producerThread = new Thread(new ProducerThread(list));

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();


    }
}
