package com.BDIC.literal;

//把包导入，类似c语言#include
import java.util.Scanner;

public class Demo4_键盘输入 {
    public static void main(String[] args){
        //1.先找到scanner
        Scanner sc=new Scanner(System.in);
        //2.让scanner干活

        //整形
        int a=sc.nextInt();

        //浮点
        double b=sc.nextDouble();

        //文本
        String str=sc.next();

        System.out.println(a + " " + b + " " + str);
    }
}
