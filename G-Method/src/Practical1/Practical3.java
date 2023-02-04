package Practical1;
/*
> 练习：开发验证码 【[CODE]()】
> 定义方法随机生成一个5位验证码。
> 验证码格式：
> - 长度5；
> - 前四位是大写字母或小写字母
> - 最后一位是数字
 */
/*
技巧：如果要在一堆无规律的数据中随机抽取，可以把这些数据先放入数组中，再随机抽取一个数组索引
 */

import java.util.Random;

public class Practical3 {
    public static void main(String[] args) {
        String result = getCertify();
        System.out.println(result);

    }

    public static String getCertify() {
        //大小写字母放到数组中
        char [] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            //ASCII码表 a---97
            if(i<=25){
                //添加小写字母
                chars[i] = (char)(97 + i);
            }else{
                //添加大写字母 a---65
                chars[i] = (char)(65 + i-26);
            }
        }
        //随机抽取4次
        Random r = new Random();
        String result="";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chars.length);
            result += chars[randomIndex];
        }
        // 从0-9中抽取一个数字，生成第5位并拼接，
        int num = r.nextInt(10);
        result += num;

        return result;
    }
}
