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
public class Exercise12 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("请输入一个字符串：");
            s = sc.next();
            //调用方法判断输入是否有效
            boolean flag = checkString(s);
            if(flag){
                break;
            }else{
                System.out.println("输入无效，请重新录入：");
                continue;
            }
        }

        //调用方法将字符串转换为罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(toRonum(c));
        }
        System.out.println(sb);



    }

    //定义方法将字符串转换为罗马数
        public static String toRonum(char num){
        String str = switch(num){
            case '0' -> "";
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default -> "";
        };
        return str;
        }
    
    //定义方法判断输入有效
    public static boolean checkString(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c <'0' || c >'9' ){
                return false;
            }
        }
        return true;
    }
}
