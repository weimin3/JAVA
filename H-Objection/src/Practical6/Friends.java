package Practical6;

public class Friends {
    //定义属性
    private String name;
    private int age;
    private String gender;
    private String habby;

    //空参构造方法
    public Friends() {
    }


    //全参构造方法
    public Friends(String name, int age, String gender, String habby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habby = habby;
    }

    //set/get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHabby() {
        return habby;
    }

    public void setHabby(String habby) {
        this.habby = habby;
    }
}
