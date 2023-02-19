package a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中两个方法是否正确
        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5,3.7,4.9,5.8,6.6};
        double avr = ArrayUtil.getAvrage(arr2);
        System.out.println(avr);

    }
}
