package com.BDIC.literal;

import java.util.Scanner;

public class Demo14_分段计费 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        //定义总钱数
        double money=cost(weight);
        System.out.print("您花费："+money+"元");


    }
    public static double cost(double w){
        //先想办法把w向上取整
        int iweight =(int)w;
        double decimal=w-iweight;
        if (decimal>0){
            iweight++;
        }
        if (iweight==1){
            return 10;
        } else if (iweight>1&&iweight<=5) {
            return 10+(iweight-1)*2;
        }
        else
            //这里要注意返回值类型
            return 18+(iweight-5)*1.5;

    }

}
