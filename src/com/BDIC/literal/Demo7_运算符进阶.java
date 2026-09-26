package com.BDIC.literal;

import java.util.Scanner;

public class Demo7_运算符进阶 {
    //将给定秒数转化为分钟和小时，60进制
    public static void main(String[] args){
        //先输入需要转换的秒数，转换成对应的小时和分钟，以及秒
        Scanner sc=new Scanner(System.in);
        int s_total=sc.nextInt();
        //先算有几个完整的小时
        int hour=s_total/3600;
        s_total=s_total%3600;
        //再算分钟
        int min=s_total/60;
        s_total=s_total%60;
        System.out.print(hour+":"+min+":"+s_total);
    }
}
