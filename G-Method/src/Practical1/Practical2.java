package Practical1;
/*
练习：找质数
判断101-200之间有多少质数，并输出所有质数。
 */
public class Practical2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 101; i < 201 ; i++) {
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("一共有"+ count + "个质数");
    }
}

