package Practical;
/*
逢7过
从任意一个数字开始报数，当报当数字是包含7或者7的倍数时，则过。 使用程序打印1-100之间满足逢7必过规则的数据。
包含7：个位包含7或者十位包含7
 */
public class Practical1 {
    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            if((i%10 == 7) || (i/10 % 10 == 7) || (i % 7 == 0)){
                System.out.println("pass");
                continue;
            }
            System.out.println(i);

        }
    }
}
