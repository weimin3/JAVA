package Practical3;

public class GoodsTest {
    public static void main(String[] args) {
        //创建数组
        Goods[] arr = new Goods[3];

        //创建3个商品对象
        Goods g1 = new Goods("001","苹果手机",5999,100);
        Goods g2 = new Goods("002","电饭锅",500,300);
        Goods g3 = new Goods("003","枸杞",100,200);

        //将商品添加到数组中
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        //遍历展示商品信息
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+ ","+goods.getPrice() + ","+goods.getStock());

        }

    }
}
