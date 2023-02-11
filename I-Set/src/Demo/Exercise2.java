package Demo;

import java.util.ArrayList;

//定义一个集合，添加数字，并进行遍历
public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(i);
            }else{
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
    }
}
