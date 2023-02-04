package Practical1;

import java.util.Scanner;

/*
练习：评委打分
> 在歌唱比赛中，有6位评委给选手打分，分数范围是1-100之间的整数；
> 选手最后得分是：去掉最高分、最低分后的4个评委的平均分。
> 请完成上述过程并计算出选手的得分
 */
public class Practical5 {
    public static void main(String[] args) {
        int[] scoreArr = getArr();
        int max= getMax(scoreArr);
        int min= getMin(scoreArr);
        int sum = getSum(scoreArr);
        int result = (sum - max - min)/(scoreArr.length-2);
        System.out.println("选手最后得分是： " + result);
    }


    //创建方法记录打分
    public static int[] getArr() {
        //创建数组记录评委打分
        int [] score= new int[6];
        //提示6次要求输入1-100之间的整数评分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; ) {
            System.out.println("请输入1-100之间的分数：");
            int scor= sc.nextInt();
            if(scor >= 0 && scor < 101){
                score[i]= scor;
                i++;
            }else{
                System.out.println("输入错误，请重新输入");
            }

        }
        return score;
    }

    //创建方法求最大、最小值
    public static int getMax(int[] array) {
        //求出数组中的最大值和最小值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max= array[i];
            }

        }
        return max;
    }

    public static int getMin(int[] array) {
        //求出数组中的最大值和最小值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    //创建方法求和
    public static int getSum(int[] array) {
        //去掉最高分、最低分，根据平均分求出最后得分
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }



}
