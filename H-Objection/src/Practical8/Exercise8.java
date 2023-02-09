package Practical8;
/*
练习：身份证信息查看
  - 1-2位省份
  - 3-4位城市
  - 5-6位区县
  - 7-14位：出生年月日
  - 15-16：所在地派出所
  - 17：性别（奇数是男性，偶数是女性）
  - 18：个人信息码（随机产生）
  - 要求取出7-14位，17位，生成人物信息：
    - 出生年月日： XXXX年x月X日
    - 性别：男/女
 */
public class Exercise8 {
    public static void main(String[] args) {
        //输入身份证信息
        String id="110123199909053279";
        //提取年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month +"月"+ day + "日");

        //提取性别信息
        char gender = id.charAt(17);
        //将char转换成数字，用ASCII码，0-->48
        int num = gender - 48;
        if(num % 2 ==0){
            System.out.println("性别是：女");
        }else{
            System.out.println("性别是：男");

        }
    }
}
