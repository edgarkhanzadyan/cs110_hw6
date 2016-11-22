package utils;

/**
 * Created by Edgar on 22.11.2016.
 */
public class Math {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num*Math.factorial(num-1);
    }
    public static int factorialLoop(int num) {
        int sum = 1;
        while (num > 0) {
            sum *= num;
            --num;
        }
        return sum;
    }
}
