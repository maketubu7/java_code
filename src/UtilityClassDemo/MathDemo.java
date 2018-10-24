package UtilityClassDemo;

import java.util.Scanner;
/*
math类里面大多是三角函数，看情况使用
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);

        int num = (int)(Math.random() * 100 + 1);
        int count = 0;

        while (true){
            System.out.println("请输入一个1-100的数字：");

            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            int guess = -1;

            guess = Integer.valueOf(input);

            if(guess < num){
                count++;
                System.out.println("小了");
            }else if (guess > num){
                count++;
                System.out.println("大了");
            }else{
                count++;
                System.out.println("猜对了，你猜了"+count+"次");
                break;
            }
        }
    }
}
