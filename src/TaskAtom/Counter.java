package TaskAtom;

import java.util.concurrent.atomic.AtomicInteger;

public class  Counter {
    private int count;

    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }
}
