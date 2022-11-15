package practice;

import java.util.Random;

public final class RandomUtil {
    private static final Random RANDOM = new Random();

    private static   int x = 1;
    private static int y =  10;

    private RandomUtil(){
    }

    public static int getRandom(){

        return RANDOM.nextInt(x + y) + y;

    }


}
