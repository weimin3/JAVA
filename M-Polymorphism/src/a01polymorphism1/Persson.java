package a01polymorphism1;

public class Persson {
    private String name;
    private int age;

    public Persson() {

    }

    public Persson(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void show(){
        System.out.println(name + "," + age);
    }
}
