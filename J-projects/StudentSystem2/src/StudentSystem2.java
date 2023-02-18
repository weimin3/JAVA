import java.util.Scanner;

public class StudentSystem2 {
    public static void main(String[] args) {

        //登陆界面
        while(true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1-登陆；2-注册；3-忘记密码");
            Scanner sc = new Scanner(System.in);
            String input1 = sc.next();
            switch(input1){
                case "1" -> login();//System.out.println("登陆");
                case "2" -> signUp();//System.out.println("注册");
                case "3" -> forgetPw();//System.out.println("忘记密码");
                default -> System.out.println("选择错误，请重新选择");
            }

        }


    }

    /*
    定义登陆方法login()

     */


    /*
    定义注册方法signUp()
    1. 用户名需要满足以下要求：
       验证要求：
          用户名唯一
          用户名长度必须在3-15位之间
          只能是字母+数字的组合，不能是纯数字
    2. 密码键盘录入两次，两次一致才可注册
    3. 身份证号码需要验证。
       验证要求：
          长度为18位
          不能以0开头
          前17位，必须都是数字，最后一位可以是数字，也可以是大写X或者小写x
    4. 手机号验证。
       验证要求：
          长度为11位
          不能以0开头
          必须都是数字
     */
    public static void signUp(){
        //1.用户名
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String usrname = sc.next();
        //判断用户名是否唯一



        //2.密码

        //3.身份证号码验证

        //4.手机号验证
    }

    /*
    定义忘记密码方法forgetPw()
     */
}