package Practical8;

import java.util.Scanner;

/*
- 定义一个方法，实现字符串反转
- 键盘录入一个字符串，调用该方法后，在控制台输出结果
 */
public class Exercise5 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        //调用方法
        String s2 = convertStr(s);
        System.out.println(s2);


    }
    //定义一个方法，实现字符串反转
    public static String convertStr(String s){
        String s2="";
        for (int i=s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            s2 = s2 + c;
        }
        return s2;
    }
}
