package Practical8;

import java.util.Scanner;

//键盘接收一个字符串，程序判断该字符串是否是对称字符串，并在控制台打印出是与否。
public class Exercise9 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String S = sc.next();

        String sb = new StringBuilder().append(S).reverse().toString();


        if(S.equals(sb)){
            System.out.println("当前字符串是对称字符串");
        } else{
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
