package vol;

public class VolatileDemo {

    private static  boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                int count = 0;
                count = count++;
                System.out.println("still false : " + count);
            }
        });
        thread1.start();
        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            while (!flag) {
                flag=true;
                System.out.println("flag is set");
            }
        });
        thread2.start();

    }

}
