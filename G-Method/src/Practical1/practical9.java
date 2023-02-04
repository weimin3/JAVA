package Practical1;

import java.util.Random;

/*
练习： 抢红包
> 有5个现金红包{2，588，888，1000，10000}，代码模拟抽奖，打印每个奖项，奖项出现顺序随机且不重复。
 */
public class practical9 {
    public static void main(String[] args) {
        /*
        思路：
        打乱奖池再依次输出即可
         */
        int [] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i]= arr[index];
            arr[index]= temp;
        }

        //遍历打乱后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"次抽奖金额是：" + arr[i]);
        }
    }
}
