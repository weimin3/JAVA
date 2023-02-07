package Practical8;

import java.util.Scanner;

//键盘录入一个字符串，统计该字符串中大写字母，小写字母，数字出现的次数
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        int cCount=0;
        int sCount=0;
        int nCount=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                sCount++;
            } else if (c>='A' && c<='Z') {
                cCount++;

            } else if (c>='0' && c<='9') {
                nCount++;
            }
        }

        System.out.println("大写字母有：" + cCount + "个");
        System.out.println("小写字母有：" + sCount + "个");
        System.out.println("数字有：" + nCount + "个");
    }
}
