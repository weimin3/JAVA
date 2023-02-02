package Demo;
/*
练习:
> 写一个网站的注册界面：
> 用户名：
> 密码：
> 确认密码：
> 邮箱：
> 性别： 男  女
> 年龄：
 */
public class Setup {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参构造
    public Setup(){

    }

    //全参构造
    public Setup(String username, String password,String email, String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }

    //set/get 方法

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String gender(){
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int age(){
        return age;
    }

}
