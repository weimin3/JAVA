package Demo;

import java.util.Random;

//练习： 定义一个数组，存入1-5，打乱数组中所有数据的顺序。
public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int randomindex = r.nextInt(arr.length);
            arr[i]= arr[randomindex];
            arr[randomindex]= temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
