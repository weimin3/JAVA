package Demo;

import java.util.Random;
/*
> 生成10个1-100之间的随机数存入数组。
>
> 1） 求所有数据的和
> 2）求所有数据的平均数
> 3）统计有多少个数据比平均值小
 */
public class Exercise5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
       //生成数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) +1;
            //为什么不可以在这里直接打印？ 因为一个循环只干一件事情
            //System.out.println(arr[i]);
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //求平均数
        double avg = sum/ arr.length;

        //统计比平均值小的数的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }

        //打印结果
        System.out.println("该数组和为：" + sum);
        System.out.println("平均数为：" + avg);
        System.out.println("比平均值小的数的个数为：" + count);





    }
}
