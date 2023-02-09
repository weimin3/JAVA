package Practical8;

public class Exercise7 {
    public static void main(String[] args) {
        //获取一个手机号码
        String phoneNumber = "13112349468";
        //截取手机号前三位
        String start = phoneNumber.substring(0,3);
        //截取手机号后四位
        String end = phoneNumber.substring(7);
        //拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
