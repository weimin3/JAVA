package Practical5;

public class Phone {
    //定义私有属性
    private String brand;
    private int price;
    private String color;

    //空参构造方法
    public Phone() {
    }

    //全参构造方法
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //私有属性的set/get
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
