package com.BDIC.literal;

import java.util.Scanner;

public class Demo5_BMI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double weight=sc.nextDouble();

        double height=sc.nextDouble();

        double bmi=weight/(height*height);
        System.out.println(bmi);
    }
}
