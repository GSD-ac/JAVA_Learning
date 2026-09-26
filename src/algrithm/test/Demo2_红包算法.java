package algrithm.test;

/*
红包问题

给你两个整数 M 和 N，M 表示红包的总额，N 表示红包的个数
现在有 N 个人来抽红包，每个人都是随机的，打印每个人领的红包金额

注 1：每个人最少 1 分钱
注 2：每个人领完红包之后，至少预留 1 * N 分钱
注 3：最后一个人是拿剩余的总额
 */

import java.util.Random;

public class Demo2_红包算法 {
    public static void main(String[] args) {
        //定义红包可以用分做单位，可以省去精度问题
        int m=20000;
        int n=5;

        //利用循环分配红包，循环次数应该是n-1，因为最后一个人的红包是确定的
        for (int i = 1; i < n; i++) {
            Random r=new Random();
            //必须得给后面的每个人至少留一分钱,+1是因为随机数的右边界不包括右边界本身
            int money=r.nextInt(m-n+i+1);
            System.out.println("第"+i+"个人获得的奖金是；"+money+"分");
            m=m-money;
        }
        System.out.println("第"+n+"个人获得的奖金是；"+m+"分");
    }
}
