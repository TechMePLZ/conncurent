public class AnotherThreadIMPL implements Runnable {


    @Override
    public void run() {
        System.out.println("Thread impl Runnable name " + Thread.currentThread().getName());
    }
}
