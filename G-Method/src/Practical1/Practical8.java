package Practical1;

import java.util.Random;
/*
练习： 抢红包
有5个现金红包{2，588，888，1000，10000}，代码模拟抽奖，打印每个奖项，奖项出现顺序随机且不重复。
 */
public class Practical8 {
    public static void main(String[] args) {
        int [] arr = {2,588,888,1000,10000};
        //创建数组存储已抽奖项
        int [] new_arr= new int[arr.length];

        Random r = new Random();
        int i = 0;
        while(i < arr.length){
            //生成任意索引
            int index = r.nextInt(arr.length);
            //判断该索引的值是否在新数组中
            boolean flag = inArr(arr[index], new_arr);
            if(!flag){
                System.out.println("第" + (i+1)+"次抽奖金额是：" + arr[index]);
                new_arr[i] = arr[index];
                i++;
            }
        }

    }

    //定义方法检查一个数是否在另一个数组中
    public static boolean inArr(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }
}
