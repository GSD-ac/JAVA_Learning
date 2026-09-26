package com.BDIC.literal;

import java.util.Random;
import java.util.Scanner;

public class Demo10_猜数字 {
    public static void main(String[] args){
        //先找到这个类
        Random r=new Random();
        //生成0--100的随机数
        int n=r.nextInt(101);


        while (true){
            //System.in应该写在上面，因为他是传给scanner构造方法的参数
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            if(guess<n){
                System.out.println("猜小了");
            }
            else if(guess>n){
                System.out.println("猜大了");
            }
            else{
                System.out.println("恭喜你，猜对了");
                break;
            }
        }

    }
}
