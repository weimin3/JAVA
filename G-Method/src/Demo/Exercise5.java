package Demo;
/*
练习：判断是否存在
>
> 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处。
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] arr={1,5,8,12,56,89,34,67};
        boolean flag = inArr(2,arr);
        System.out.println(flag);
    }
    public static boolean inArr(int num, int[] array){
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]){
                return true;
            }
        }
        return false;
    }
}
