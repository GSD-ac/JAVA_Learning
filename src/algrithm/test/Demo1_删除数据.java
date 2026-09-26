package algrithm.test;
/*# 移除元素

给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素

举例 1：
输入：nums = [3,2,2,3] val = 3
输出：nums = [2,2] 剩余 2 个元素

举例 1：
输入：nums = [0,1,2,2,3,0,4,2] val = 2
输出：nums = [0,1,4,0,3] 剩余 5 个元素*/

public class Demo1_删除数据 {
    public static void main(String[] args){

        //快慢指针
        //先给定数组
        int[] arr={2,2,1,1,2,2,3,3,3};
        int value=2;

        //定义快慢指针
        int fast=0,slow=0;
        for (; fast <arr.length ; fast++) {
            if(arr[fast]!=2){
                arr[slow]=arr[fast];
                slow++;
            }
        }

        //这里必须得是<slow因为，最后slow++了，所以有效数据是slow前面的
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
