package Demo;
/*
练习：
> 某商场每季度营业额如下：
> 第一季度：22，66，44
> 第二季度：77，33，88
> 第三季度：25，45，65
> 第四季度：11，66，99
> 计算每季度的总营业额和全年总营业额。
 */
public class Exercise7 {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        int yearSum=0;
        for (int i = 0; i < arr.length; i++) {
            int quaterSum = getSum(arr[i]);
            System.out.println("第"+(i+1)+"季度总营业额是"+ quaterSum);
            yearSum += quaterSum;
        }
        System.out.println("年营业总额是："+ yearSum);

    }

    //定义方法计算每季度营业总额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
