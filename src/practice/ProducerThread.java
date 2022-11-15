package practice;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                int randomValue = RandomUtil.getRandom();
                System.out.println("producer adds value : " + randomValue + " size = " + list.size());
                list.add(randomValue);
                try {
                   int randomValue1 =  RandomUtil.getRandom();
                    System.out.println("producer is waiting value milis : " + randomValue1);
                   list.wait(randomValue1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
