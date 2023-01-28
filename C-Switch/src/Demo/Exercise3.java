package Demo;
import java.util.Scanner;
/*
练习：预定电话选择
  拨打机票预定电话，语音提示：
 - 1 机票查询
 - 2 机票预定
 - 3 机票改签
 - 4 退出服务
 - 其他按键也退出服务
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个号码");
        int num = sc.nextInt();
        switch (num){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");


        }

    }

}
