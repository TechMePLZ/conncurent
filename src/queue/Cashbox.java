package queue;

public class Cashbox {

    private static int generator = 1;
    private int id;

    public Cashbox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "Cashbox " +
                "id=" + id;
    }

    /*

     */
    public void testComments() {
        int i = 0;
        boolean check = true;
        System.out.println("просто тест");
    }
}
