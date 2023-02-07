package Practical8;

import java.util.Scanner;

//键盘录入一个字符串，使用程序实现在控制台遍历该字符串
public class Exercise2 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        //遍历输出
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);

        }
    }
}
