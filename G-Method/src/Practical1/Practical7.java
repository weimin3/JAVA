package Practical1;
/*
加密的数据解密出来。8346--> 1983
 */
public class Practical7 {
    public static void main(String[] args) {
        //将数字拆分到数组中
        int code = 8346;
        int temp = code;

        int count = 0;
        while(code !=0){
            code = code/10;
            count++;
        }

        int[] arr = new int[count];
        int index = arr.length-1;

        while(temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;//很重要，不要忘记

        }
        //解密
        //反转
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp1= arr[i];
            arr[i]=arr[j];
            arr[j]= temp1;
        }


        //反取余： 因为原数据0-9，+5 --> 5-14, 即余数反余的范围是5-14，故，0-4的原数是10-14，5-9的原数是5-9
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && arr[i]<=4){
                arr[i]= arr[i] + 10;
            }
        }

        //减5
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]-5;
        }


        //重新拼接
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result= result* 10 +arr[i];
        }
        System.out.println(result);
    }
}
