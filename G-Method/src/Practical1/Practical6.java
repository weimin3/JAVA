package Practical1;
/*
练习：数字加密
> 某系统的数字密码大于0，比如1983，采用加密方式进行传输。
> 规则如下：
> 先得到每位数，然后每位数加上5，再对10求余，最后将所有数字反转，得到一串新数。1983--> 8346
 */
public class Practical6 {
    public static void main(String[] args) {
        /*
        将数字拆了放入数组中1983-> [1,9,8,3]
        思路：反向推导
        1. 计算数组长度
        2. 定义数组
        3. 数据拆分放到数组中
         */
        int code = 1983;
        int temp = code;
        // 1. 计算数组长度
        int count = 0;
        while(code != 0){
            code = code / 10;
            count ++;
        }
        //2. 定义数组
        int[] arr = new int[count];

        //3. 数据拆分放到数组中
        int index = arr.length-1;
        while(temp !=0){
            //取末位数
            int ge = temp % 10;
            //末位数放在数组最后一位
            arr[index] = ge;
            index --;
            //将原始数据去掉一位
            temp = temp / 10;
        }

        /*
        加密思路
        1.加5，对10求余
        //2. 反转
         */
        //1.加5，对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]+5) % 10;
        }

        //2. 反转
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
                int temp1 = arr[i];
                arr[i]= arr[j];
                arr[j]=temp1;
        }

        // 重新拼成新数
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 +arr[i];
        }
        System.out.println(result);
    }

}
