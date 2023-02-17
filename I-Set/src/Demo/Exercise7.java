package Demo;

import java.util.ArrayList;

/*
main方法中定义一个集合，存入三个手机对象
定义一个方法，将价格低于3000的手机信息返回
 */
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("iphone",8000);
        Phone p3 = new Phone("huawei",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        //调用方法，将价格低于3000的手机信息返回
        ArrayList<Phone> phonelist = getInfo(list,3000);
        for (int i = 0; i < phonelist.size(); i++) {
            System.out.println("价格低于"+3000 + "的手机信息是：品牌：" + phonelist.get(i).getBand() + "价格:" + phonelist.get(i).getPrice());

        }
    }

    //定义一个方法，将价格低于3000的手机信息返回,要求返回而非打印，因此将要返回的多个数据先放到一个容器中，将容器返回
    public static ArrayList<Phone> getInfo(ArrayList<Phone> list,int stPrice){
        ArrayList<Phone> result = new ArrayList<>();
        //boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < stPrice){
                result.add(list.get(i));
                //System.out.println("价格低于"+stPrice + "的手机信息是：品牌：" + list.get(i).getBand() + "价格:" + list.get(i).getPrice());
            }
        }
        //flag = false;
       // if(flag){
        //    System.out.println("没有价格低于"+ stPrice+ "的手机");
        //}
        return result;
    }
}
