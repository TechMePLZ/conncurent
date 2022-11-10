public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
        var threadRunnable = new Thread(new AnotherThreadIMPL(), "runnable thread");
        threadRunnable.start();

        simpleThread.start();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
        try {
            threadRunnable.join(10000L);
            simpleThread.join();
            System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}
