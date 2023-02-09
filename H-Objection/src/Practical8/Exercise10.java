package Practical8;
/*
- 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
- 调用该方法，在控制台输出结果
 */
public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String s = toString(arr);
        System.out.println(s);


    }
    //定义方法
    public static String toString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
