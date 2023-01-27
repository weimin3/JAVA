package Demo1;
/*
练习3：三个人身高分别是150cm, 210cm, 165cm, 获取最高身高
 */
public class Exercise3 {
    public static void main(String[] args) {
        //定义三个变量记录身高
        int weight1 = 150;
        int weight2 = 210;
        int weight3 = 165;
        //先比较前两个变量的值，再用前两个变量的结果和第三个值比较
        int temp = weight1 > weight2? weight1 : weight2;
        int max = temp > weight3? temp : weight3;
        //打印结果
        System.out.println(max);
    }
}
