package Demo;
/*
练习： 复制数组
> 定义一个方法copyOfRange(int[] arr, int from, int to)
> 将数组arr中从索引from（包含from）开始，到索引to 结束（不包含to）的元素复制到新数组中，将新数组返回。
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] newArr = copyOfRange(arr, 3, 7);
        printArr(newArr);
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int length = to - from;
        int[] newArr = new int[length];
        //以下这样写是错误的，结果是[7,7,7,7]
        /*
        for (int i = 0; i < newArr.length; i++) {
            for (int j = from; j < to; j++) {
                newArr[i]=arr[j];
            }
        }
         */
        int index = 0;//伪造索引
        for (int i = from ; i < to; i++) {
            newArr[index] = arr[i];
            index++;

        }
        return newArr;
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
