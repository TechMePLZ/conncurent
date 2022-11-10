package ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        ListThread listThread = new ListThread(list);
        ListThread listThread1 = new ListThread(list);
        ListThread listThread2 = new ListThread(list);
        ListThread listThread3 = new ListThread(list);
        ListThread listThread4 = new ListThread(list);
        ListThread listThread5 = new ListThread(list);
        ListThread listThread6 = new ListThread(list);

        listThread.start();
        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();

        listThread.join();
        listThread1.join();
        listThread2.join();
        listThread3.join();
        listThread4.join();
        listThread5.join();
        listThread6.join();


        System.out.println(list.size());


    }
}
