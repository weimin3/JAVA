package Demo;
/*
练习： 遍历数组并求和
定义一个数组，存储1，2，3，4，5， 遍历数组得到每一个元素，求数组中所有数据的和。
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

}
