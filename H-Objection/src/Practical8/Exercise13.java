package Practical8;
/*
给定两个字符串，A 和 B。
- A的旋转操作就是将A最左边的字符移动到最右边。例如：A='abcde'在移动一次之后结果就是'bcdea'
- 如果在若干次调整操作之后A能变成B，返回True,否则false
 */
public class Exercise13 {
    public static void main(String[] args) {
        //给定两个字符串，A 和 B。
        String strA = "abcde";
        String strB = "ABC";



        //调用方法旋转字符串并比较
        boolean flag = compare(strA,strB);
        if(flag){
            System.out.println("经过调整后，A 能变成 B");
        }else{
            System.out.println("经过调整后，A 不能变成 B");
        }



    }
    //定义方法旋转字符串并比较
    public static boolean compare(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    //定义方法旋转字符串 方法一：使用subString截取，将左边的字符截取出来拼接到右侧去
    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        String new_str = end + first;
        return new_str;
    }
}
