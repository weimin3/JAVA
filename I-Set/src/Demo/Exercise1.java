package Demo;

import java.util.ArrayList;

//定义一个集合，添加字符串，并进行遍历
public class Exercise1 {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("how");
        list.add("are");
        list.add("you");
        list.add("?");
        list.add("I");
        list.add("miss");
        list.add("you");
        //遍历集合
        System.out.printf("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
