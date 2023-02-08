package Practical8;

import java.util.Scanner;

//- 输入一个整数，转换成中文大写，例如：12345 转换成 壹万贰千叁佰肆拾伍元
public class Exercise6 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("请录入一个金额：");
            num = sc.nextInt();
            if(num>=0 && num <= 9999999){
                break;

            }else{
                System.out.println("输入错误，请重新录入");
            }
        }
        //定义一个变量用来表示钱的大写
        String numStr ="";

        //2.得到num里面的每一个数字,转换成中文，并拼接
        while(num != 0){
            int ge = num % 10;
            //大写转换并拼接
            String capitalNum = getCapitalNum(ge);
            numStr = capitalNum + numStr;
            num = num / 10;
            //System.out.println(numStr);
        }
        //3.在前面补零，补齐7位。
        int count = 7 - numStr.length();
        for (int i = 0; i < count; i++) {
            numStr ="零"+ numStr;
        }
        //4.插入单位
        //定义一个数组表示单位
        String[] arr2={"佰","拾","万","仟","佰","拾","元"};
        //遍历numStr,依次得到数字大写，然后把arr2中的单位插入
        String result = "";
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            result = result + c + arr2[i];
            //System.out.print(c);
            //System.out.print(arr2[i]);
        }
        System.out.println(result);


    }

    //定义方法用查表法将索引和中文大写一一对应，即0->零 1-> 壹
    public static String getCapitalNum(int number){
        String[] s= {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回结果
        return s[number];

    }

}
