package Practical;

import java.util.Random;
import java.util.Scanner;

/*
练习：模拟双色球
> 投注号码有两部分组成：6个红球和1个蓝球，红球从1-33中选择，蓝球从1-16中选择。
> 中奖规则：
> 一等奖：6红+1蓝
> 二等奖：6红+0蓝
> 三等奖：5红+1蓝
> 四等奖：4红+1蓝 或 5红+0蓝
> 五等奖：3红 + 1蓝 或 4红+0蓝
> 六等奖：2红+1蓝 或 1红+1蓝  或 0红+1蓝
 */
/*
思路：
1.生成中奖号码
2.用户输入7位号码
3.对比确定奖项
 */
public class Practical10 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = getNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        //用户输入7位号码
        int[] usrInputNumber = usrInputNumber();
//        for (int i = 0; i < usrInputNumber.length; i++) {
//            System.out.print(usrInputNumber[i] + " ");
//
//        }

        //对比奖项
        //统计输入的红球和蓝球与生成的红球和蓝球相同的个数
        int redCount = 0;
        int blueCount = 0;

        //统计红球的个数
        for (int i = 0; i < usrInputNumber.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(usrInputNumber[i] == arr[j] ){
                    redCount++;
                    break;
                }
            }

        }

        //统计蓝球的个数
        if(usrInputNumber[usrInputNumber.length-1] == arr[arr.length-1]){
            blueCount++;
        }


        //根据红球和蓝球个数判断奖项
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜您中了一等奖，奖金1000万");
        } else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜您中了二等奖，奖金500万");
        } else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜您中了三等奖，奖金3000");
        } else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜您中了四等奖，奖金200");
        }else if((redCount == 3 && blueCount == 1) || (redCount == 4 && blueCount == 0)){
            System.out.println("恭喜您中了五等奖，奖金10");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜您中了六等奖，奖金5");
        } else{
            System.out.println("谢谢参与！");
        }


    }

    //1.创建方法生成中奖号码
    public static int[] getNumber(){
        //创建存储奖项的数组
        int[] arr = new int[7];

        Random r = new Random();

        //红球：6位，且不可重复，1-33中选择
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33)+1;
            //判断这个数是否已经在红球序列中，如是，则重新生成，否则存入数组
            boolean flag = inArr(arr,redNumber);
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }

        //篮球：1位，可与红球重复，1-16中选择
        arr[arr.length-1]=r.nextInt(16)+1;

        //返回奖池数组
        return arr;
    }

    //创建方法判断一个数是否在数组中
    public static boolean inArr(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]){
                return true;
            }
        }
        return false;
    }

    //创建方法让用户输入7位号码
    public static int[] usrInputNumber(){
    //创建数组存储用户输入的号码
        int[] usrInputNumber = new int[7];

        //要求用户输入6个红球号码，数值范围1-33之间，不可重复
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码：");
            int inputNumber = sc.nextInt();
            //判断是否在1-33之间
            if(inputNumber >= 1 && inputNumber <=33){
                //判断输入的号码是否已经在列表中
                boolean flag1 = inArr(usrInputNumber,inputNumber);
                if(!flag1){
                    usrInputNumber[i]=inputNumber;
                    i++;
                }else{
                    System.out.println("重复数据，请重新输入");
                }
            }else{
                System.out.println("输入超出范围，请重新输入");
            }

        }

        //要求用户输入1个篮球号码，数值范围1-16之间
        while(true){
            System.out.println("请输入蓝球号码：");
            int blueNumber = sc.nextInt();
            //判断输入的值是否在1-16之间
            if(blueNumber >= 1 && blueNumber <=16){
                usrInputNumber[usrInputNumber.length-1] = blueNumber;
                break;
            }else{
                System.out.println("输入不符合要求，请重新输入");
            }
        }
        return usrInputNumber;
    }

}
