package com.BDIC.literal;

public class Demo3_数据类型 {
    public static void main(String[] args){
        //新类型，最高到+-128
        byte a=10;

        //浮点数必须以F或f结尾
        float f=16.0f;
        double b=10.00F;
        System.out.println(b+f);

        //布尔
        boolean bb=true;
        System.out.println(bb);

        //字符（打印的时候不需要加双引号）
        char c='我';
        //必须用单引号
        System.out.println(c);
    }
}
