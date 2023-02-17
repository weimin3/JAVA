package Demo;

import java.util.ArrayList;

/*
main 方法中定义一个集合，存入三个用户对象，用户属性为：id,username,password
定义一个方法，根据id查找对应的用户信息，如存在返回索引，如不存在，返回-1
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001","张三","12345");
        User u2 = new User("002","李四","12345444");
        User u3 = new User("003","王武","12345aaa");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法根据id查找用户信息，并返回索引
        int index = inArr(list,"001");
        System.out.println(index);


    }

    //定义一个方法，根据id查找对应的用户信息，如存在返回索引，如不存在，返回-1
    public static int inArr(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }

        }
        return -1;


    }
}
