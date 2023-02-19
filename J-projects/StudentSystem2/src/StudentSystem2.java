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
    1.键盘录入用户名
    2.键盘录入密码
    3.键盘录入验证码
    验证要求：
    1. 用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
    2. 判断验证码是否正确，如不正确，重新输入
    3.判断用户名和密码是否正确，有3次机会
    验证码规则：
    1. 长度为5
    2. 由4位大写或小写字母和1位数字组成，同一字母可重复
    3. 数字可以出现在任意位置

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
    1. 键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束，并提示：未注册
    2. 键盘录入身份证号和手机号
    3. 判断当前用户的身份证号码和手机号码是否一致，如果一致，则提示输入密码，进行修改；如果不一致，则提示：账户信息不匹配，修改失败
     */
}