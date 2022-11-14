package account;

import java.math.BigDecimal;

public class Account {

    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        this.id = generator++;
    }

    /**
     *
     * @param amount
     */
    public void add(int amount){
        this.money += amount;
    }

    /**
     *
     * @param amount
     * @return
     */
    public boolean takeOff(int amount){
        if(this.money > amount){
            this.money -= amount;
            return true;
        }   return false;
    }

    @Override
    public String toString() {
        return "Account " +
                "id=" + id +
                ", money= " + money;

    }
}
