package com.BDIC.literal;

import java.util.Scanner;

public class Demo6_运算符小练习 {
    public static void main(String[] args){
        //键盘录入一个数，判断位数然后分别输出
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int tmp=0;
        for(int i=0;n>0;i++){
            tmp=n%10;
            //记得给n来一个自减
            n/=10;
            System.out.println(tmp);
        }
    }
}
