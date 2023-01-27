package Demo1;

import java.util.Scanner;

//键盘录入一个整数，表示钱包里的钱。如果大于等于100元，吃烧烤；否则吃米粉
public class Exercise2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //输入值
        System.out.println("请输入钱包内现金数量：");
        int money = sc.nextInt();
        //判断
        if(money >= 100){
            System.out.println("吃烧烤");
        } else {
            System.out.println("吃米粉");
        }
    }
}
