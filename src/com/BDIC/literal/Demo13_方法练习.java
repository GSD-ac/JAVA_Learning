package com.BDIC.literal;

import java.util.Scanner;

public class Demo13_方法练习 {
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //得在main里面调用方法
        printarray(arr);

    }
    //定义方法必须写在方法外面，Java不支持方法的嵌套！！！！！！
    //定义一个方法打印数组
    public static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
