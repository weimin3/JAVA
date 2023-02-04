package Practical3;

public class Goods {
    //定义属性
    private String id;
    private String name;
    private int price;
    private int stock;

    //空参构造方法
    public Goods(){}

    //全参构造方法
    public Goods(String id, String name, int price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //私有属性set/get
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
