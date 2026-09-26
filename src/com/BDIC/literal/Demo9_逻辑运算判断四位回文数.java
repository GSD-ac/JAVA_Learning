package com.BDIC.literal;

import java.util.Scanner;

public class Demo9_逻辑运算判断四位回文数 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=num%10;
        num/=10;
        int b=num%10;
        num/=10;
        int c=num%10;
        num/=10;
        int d=num%10;
        if ((a==d)&&(b==c)){
            System.out.println("True");
        }
    }
}
