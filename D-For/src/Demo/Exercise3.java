package Demo;
// 求1-100之间的偶数和
public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 101; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("1-100之间的偶数和是：" + sum);
    }
}
