package Demo;

import java.util.Scanner;

/*
练习： 回文数
> 键盘录入一个整数X，如果X是回文，打印true,否则打印false。
> 回文是正序和倒序读都一样的整数。例如：121 1221
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int temp = num;
        int new_num=0;
        while(num !=0){
            int ge = num % 10;
            num = num / 10;
            new_num = new_num * 10 + ge;
        }
        System.out.println(new_num);
        System.out.println(new_num == temp);

    }
}
