package Practical;


import java.util.Scanner;

/*
> 练习：买机票
> 机票价格根据淡旺季，头等舱和经济舱不同；
> 输入机票原价，月份和仓位类别计算出机票价格
> 旺季（5-10月）头等舱9折，经济舱8.5折；淡季（11-来年4月） 头等舱7折，经济舱6.5折。
 */
public class Practical1 {
    public static void main(String[] args) {
        //输入机票原价，月份和仓位类别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double  ori_price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入仓位等级（0：头等舱； 1:经济舱）：");
        int Class = sc.nextInt();

        //先判断淡旺季，再根据仓位计算机票
        double new_price = 0;
        switch(month){
            case 5,6,7,8,9,10 -> new_price = getNew_price(Class, ori_price, 0.9, 0.85);
            case 11,12,1,2,3,4 -> new_price = getNew_price(Class, ori_price, 0.7, 0.65);
        }
        System.out.println("打折后机票价格是"+ new_price);
    }

   public static double getNew_price(int Class, double ori_price, double x, double x1) {
       double new_price =0;
        if(Class == 0){
            new_price = ori_price * x;
        }else if (Class == 1){
            new_price = ori_price * x1;
        }else{
            System.out.println("输入错误");
        }
        return new_price;
    }

}
