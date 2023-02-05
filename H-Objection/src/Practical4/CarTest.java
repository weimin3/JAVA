package Practical4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组存3个汽车对象
        Car[] arr = new Car[3];
        //创建汽车对象，数据来源于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //对象应该创建在循环内，否则只有一个对象
            Car c = new Car();
            //输入品牌
            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            c.setBrand(brand);

            //输入价格
            System.out.println("请输入价格：");
            int price = sc.nextInt();
            c.setPrice(price);

            //输入颜色
            System.out.println("请输入颜色：");
            String color = sc.next();
            c.setColour(color);

            //将值放入数组中
            arr[i]= c;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColour());

        }
    }
}
