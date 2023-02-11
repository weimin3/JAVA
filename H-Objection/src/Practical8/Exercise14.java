package Practical8;
/*
给定两个字符串，A 和 B。
- A的旋转操作就是将A最左边的字符移动到最右边。例如：A='abcde'在移动一次之后结果就是'bcdea'
- 如果在若干次调整操作之后A能变成B，返回True,否则false
 */
public class Exercise14 {
    public static void main(String[] args) {
        //给定两个字符串，A 和 B。
        String strA = "abcde";
        String strB = "ABC";
        boolean flag = compare(strA,strB);
        if(flag){
            System.out.println("A 能调整为 B");
        }else{
            System.out.println("A 不能调整为 B");
        }

    }
    //定义方法旋转并比较字符串
    public static boolean compare(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = romote(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    //定义方法旋转字符串,方法二：把字符串变成一个字符数组，调整字符数组内数据，最后把字符数组变成字符串
    public static String romote(String str){
        //字符串变成一个字符数组
        char[] chars = str.toCharArray();
        //取出0索引的字符
        char first = chars[0];
        //把剩余的字符依次往前挪一个位置
        for (int i = 1; i < chars.length; i++) {
            chars[i-1] = chars[i];
        }
        //0索引的值放到最后
        chars[chars.length-1]=first;
        //利用字符数创建一个字符串对象
        String result = new String(chars);
        return result;




    }
}
