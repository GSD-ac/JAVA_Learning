package algrithm.test;

/*
中位数

给定两个正序数组 arr1 和 arr2，请先合并数组，并找出合并之后数组的中位数。

举例：
        1 2 3 4 5 6 7 8 9　　　中位数：5
        1 2 3 4 5 6　　　　　中位数：(3 + 4) / 2
 */

public class Demo3_二路归并找中位数 {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4};

        int l=arr1.length+arr2.length;

        //定义两个数组的下标索引,必须写在循环外，要不然每次循环都会重置
        int i1=0,i2=0;
        //定义新数组
        int[] arr=new int[l];
        for (int i = 0; i <l; i++) {

            //还得防止越界，做两个检测
            //1先完了，后面直接全粘贴2的
            if (i1==arr1.length){
                arr[i]=arr2[i2];
                i2++;
                //记得加continue，直接跳过本次循环，不要再执行后两个语句了
                continue;
            }

            if (i2==arr2.length){
                arr[i]=arr1[i1];
                i1++;
                //记得加continue，直接跳过本次循环，不要再执行后两个语句了
                continue;
            }


            if (arr1[i1]<arr2[i2]){
                arr[i]=arr1[i1];
                i1++;
            }
            else{
                arr[i]=arr2[i2];
                i2++;
            }

            //不能在这里写，因为continue会跳过后面的语句
            //System.out.print(arr[i]+" ");
        }
        for (int i = 0; i <l; i++) {
            System.out.print(arr[i]+" ");
        }
        //求中位数
        double median;
        if(l % 2 == 1){
            median = arr[l / 2];
        }else{
            median = (arr[l/2 - 1] + arr[l/2]) / 2.0;
        }
        System.out.println("\n中位数 = " + median);
    }
}
