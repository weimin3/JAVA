package Practical4;

public class Car {
    //定义属性
    private String brand;
    private int price;
    private String colour;

    //空参构造方法
    public Car() {
    }
    //全参构造方法
    public Car(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    //私有变量set/get值

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
