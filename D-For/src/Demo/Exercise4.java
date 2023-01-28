package Demo;

import java.util.Scanner;

/*
练习：键盘录入两个数字，表示一个范围，统计这个范围内既能被3整除，又能被5整除的数字个数。
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int num2 = sc.nextInt();

        int star = num1 > num2? num2 : num1;
        int end = num1 > num2? num1 : num2;

        int count = 0;
        for (int i = star; i < end+1; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println(star + "到" + end + "之间，能同时被3和5整除的数有：" + count + "个");
    }
}
