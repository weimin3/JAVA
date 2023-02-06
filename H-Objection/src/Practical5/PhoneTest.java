package Practical5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //创建数组
        Phone[] arr= new Phone[3];
        //创建3个手机对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Phone p = new Phone();
            System.out.println("请输入品牌：");
            String brand = sc.next();
            p.setBrand(brand);

            System.out.println("请输入价格：");
            int price = sc.nextInt();
            p.setPrice(price);

            System.out.println("请输入颜色：");
            String color = sc.next();
            p.setColor(color);

            arr[i] = p;
        }

        //计算总价
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }

        int avg = sum / arr.length;
        System.out.println("三部手机的均价是：" + avg);

    }
}
