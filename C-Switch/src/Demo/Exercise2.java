package Demo;

import java.util.Scanner;

/*
练习：休息日和工作日
键盘录入星期输，输出工作日、休息日。（1-5）工作日，（6-7）休息日。
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int day = sc.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    }
}
