package BDIC.lab;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        Scanner num1 =new Scanner(System.in);
        int x= num1.nextInt();

        System.out.print("Please enter an operator: ");
        Scanner s=new Scanner(System.in);
        //输入单个字符的方法
        char o=s.next().charAt(0);

        System.out.print("Please enter next integer: ");
        Scanner num2 =new Scanner(System.in);
        int y= num2.nextInt();


        //switch语句
        switch(o){
            //记得要用单引号，不要用括号
            case'-':
                System.out.println("The expression evaluates to "+(x-y));
                break;
            case'+':
                System.out.println("The expression evaluates to "+(x+y));
                break;
            case'*':
                System.out.println("The expression evaluates to "+(x*y));
                break;
            case'/':
                System.out.println("The expression evaluates to "+(x/y));
                break;
            default:
                System.out.println("The operator is not understood. Should be -, +, *, or /.");
        }
    }
}
