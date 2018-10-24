package UtilityClassDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        //取值  0<=x<100
        System.out.println(random.nextInt(100));
        int count = 0;
        int sum = 0;

        while (count < 1000){
            sum += random.nextInt(100);
            count++;
        }
        System.out.println("平均值为："+ sum/count);
    }
}
