package Practical;
//将一个数组中的元素复制到另一个新数组中
public class Practical4 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr1={1,2,3,4,5,6,7,8,9};
        //定义一个新数组
        int[] arr2 = new int[arr1.length];

        //伪索引
        //int index =0;
        for (int i = 0; i < arr1.length; i++) {
            //arr2[index] = arr1[i];
            //index++;
            arr2[i] = arr1[i];
        }
        //打印复制后的数组
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if(i== arr2.length-1){
                System.out.print(arr2[i]);
            }else{
                System.out.print(arr2[i] + "，");
            }
        }
        System.out.print("]");

    }
}
