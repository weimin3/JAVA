package Practical8;
/*
- 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
- 调用该方法，并在控制台输出结果
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String s = arrToString(arr);
        System.out.println(s);

    }
    //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String s = "[";
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                s= s + arr[i];
            }else{
                s= s + arr[i]+",";
            }
        }
        s += ']';
        return s;
    }


}
