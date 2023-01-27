package Demo1;

import java.util.Scanner;

/*
练习： 电影院选座
某电影院售卖100张票，序号1-100，奇数票号坐左侧，偶数票号坐右侧；键盘录入一个整数表示票号，如果为奇数，打印坐左边；偶数打印坐右边。
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int ticket = sc.nextInt();
        //先判断输入是否在1-100之间，再判断奇偶数
        if(ticket >0 && ticket < 101){
            if(ticket % 2 == 0){
                System.out.println("请坐右边");
            }else{
                System.out.println("请坐左边");
            }
        } else{
            System.out.println("输入错误。");
        }

    }
}
