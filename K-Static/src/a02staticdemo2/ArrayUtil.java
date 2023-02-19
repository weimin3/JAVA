package a02staticdemo2;

public class ArrayUtil {
    //私有化构造方法，目的是为了不让外界创建其对象
    private ArrayUtil(){}

    //将printArr定义为静态方法，方便调用
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",") ;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //getAvrage方法
    public static double getAvrage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }
}
