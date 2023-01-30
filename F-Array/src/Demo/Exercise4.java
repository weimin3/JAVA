package Demo;
//已知数组元素为{33，5，22，44，55}，找出最大值打印在控制台
public class Exercise4 {
    public static void main(String[] args) {
        int [] arr = {33,5,22,44,55};
        //不能把max初始赋值为0的原因是：如果数组内都为负数，则最大值为0，此结果在数组中不存在
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值是："+ max);
    }
}
