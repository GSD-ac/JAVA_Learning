package com.BDIC.literal;

import java.util.Scanner;

public class Demo12_数组 {
    public static void main(String[] args){
        //数组静态初始化
        int[] a={1,2,3};

        //数组的动态初始化
        int[] arr=new int[3];

        //赋值，sc是引用类型变量，表示的是地址
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入；");
            arr[i]=sc.nextInt();
        }
    }
}
