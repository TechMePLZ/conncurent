package practice;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removeValue = list.remove();
                    System.out.println("consumer get value : " + removeValue + " size = " + list.size());
                }else   {
                    System.out.println("list is empty! consumer waiting");
                }
                try {
                    int randomValue = RandomUtil.getRandom();
                    System.out.println("consumer sleep for : " + randomValue);
                    list.wait(randomValue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
