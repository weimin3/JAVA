package Demo;

import java.util.Scanner;

//给定两个正整数，被除数和除数，将两数相除得到商和余数。要求不使用乘法，除法和%运算符
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1 = sc.nextInt();
        int temp = num1;
        System.out.println("请输入除数：");
        int num2 = sc.nextInt();
        /*商是减的次数，余数是减到差比除数小的数
        5 / 2 = 2 ...1
                5-2 = 3
                        3-2= 1
         */
        int count = 0;
        while(num1 >= num2){
            num1 = num1 - num2;
            count++;
        }
        System.out.println(temp + "除以" + num2 + "商是" + count+ ", 余数是" + num1);
    }
}
