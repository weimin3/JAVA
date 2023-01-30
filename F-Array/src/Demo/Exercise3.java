package Demo;
/*
变化数据：
定义一个数组，存储1-10，遍历数组中每一个元素，如果是奇数，将当前数字扩大两倍；如果是偶数，将当前数字变为二分之一
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = arr[i] * 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
