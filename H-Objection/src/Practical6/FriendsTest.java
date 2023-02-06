package Practical6;

import java.util.Scanner;

public class FriendsTest {
    public static void main(String[] args) {
        //定义数组存放好友信息
        Friends[] arr = new Friends[4];
        //创建friends对象并键盘录入好友信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Friends f = new Friends();

            System.out.println("请输入姓名：");
            String name = sc.next();
            f.setName(name);

            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            f.setAge(age);

            System.out.println("请输入性别：");
            String gender = sc.next();
            f.setGender(gender);

            System.out.println("请输入爱好：");
            String habby = sc.next();
            f.setHabby(habby);

            //存入数组
            arr[i] = f;
        }

        //求年龄和并求平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        int avg = sum/arr.length;

        //统计年龄小于平均年龄的人数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()< avg){
                count++;
                System.out.println(arr[i].getName()+","+ arr[i].getAge()+","+arr[i].getGender()+","+arr[i].getHabby());
            }
        }

        System.out.println("4位朋友的平均年龄是：" + avg);
        System.out.println("比平均年龄小的人数是："+count);

    }
}
