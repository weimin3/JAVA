package Demo;
/*
练习： 统计个数
定义一个数组，存储1-10，统计数组中能被3整除的数字个数。
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 3 ==0){
                System.out.println(array[i]);
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字个数是："+count);
    }
}
