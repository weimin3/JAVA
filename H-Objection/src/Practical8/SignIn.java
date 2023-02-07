package Practical8;

import java.util.Scanner;

//已知正确的用户名和密码，请用程序实现模拟用户登陆，总共三次机会，登陆后，给出相应的提示
public class SignIn {
    public static void main(String[] args) {
        //存储正确的用户名和密码
        String correctUserName = "张三";
        String correctPassword = "123456";

        //模拟用户登陆，三次机会
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<3;i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            //比较
            if(userName.equals(correctUserName) && password.equals(correctPassword)){
                System.out.println("登陆成功");
                break;
            } else{
                if(i==2){
                    System.out.println("系统被锁定");

                } else{
                    System.out.println("登陆错误，用户名或密码错误,您还有"+(2-i) + "次登陆机会");
                }

            }
        }
    }
}
