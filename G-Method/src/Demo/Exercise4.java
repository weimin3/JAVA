package Demo;
//设计一个方法求数组的最大值，并将最大值返回
public class Exercise4 {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55};
        int max = maxArr(arr);
        System.out.println("数组的最大值是：" + max);

    }

    public static int maxArr(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max= array[i];
            }
        }
        return max;
    }
}
