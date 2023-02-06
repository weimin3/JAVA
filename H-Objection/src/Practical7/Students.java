package Practical7;

public class Students {
    //定义属性
    private int  id;
    private String name;
    private int age;

    //空参构造方法
    public Students() {
    }

    //全参构造方法
    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //set/get
    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
