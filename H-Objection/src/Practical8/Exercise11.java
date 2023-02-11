package Practical8;

import java.util.Scanner;

/*
练习：转换罗马数字
  - 键盘录入一个字符串，
  - 要求1：长度为小于等于9
  - 要求2：只能是数字
  - 将内容变成罗马数字
  - 以下是阿拉伯数字与罗马数字的对应：I-1 II-2 III-3,IV-4 V-5 VI-6 VII-7 VIII-8 IX - 9
  - 罗马数字中没有0
  - 如果键盘录入的数字包含0，可以变成" "(长度为0的字符串)
 */
public class Exercise11 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("请输入一个字符串：");
            s = sc.next();
            boolean flag = checkStr(s);
            if(flag){
                break;
            }else{
                System.out.println("输入不满足要求，请重新录入：");
                //continue;
            }


        }
        //转换
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c-48;
            sb.append(toString(num));
        }
        String result = sb.toString();
        System.out.println(result);


    }
    //定义方法校验输入是否满足规则
    public static boolean checkStr(String str){
        //判断长度是否小于等于9
        if(str.length()>9) {
            return false;
        }
        //判断是否都是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c <'0' || c > '9'){
                return false;
            }
        }
        return true;

    }
    //定义方法将阿拉伯数字与罗马数字的对应：I-1 II-2 III-3,IV-4 V-5 VI-6 VII-7 VIII-8 IX - 9，0-" "(长度为0的字符串)
    public static String toString(int num){
        String[] s = {" ","I","II","III","IV","V","VI","VII","VIII","IX"};
        return s[num];
    }
}
