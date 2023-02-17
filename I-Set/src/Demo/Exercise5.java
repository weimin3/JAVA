package Demo;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
    //        main 方法中定义一个集合，存入三个用户对象，用户属性为：id,username,password
        ArrayList<User> list = new ArrayList();

        User u1 = new User("001","张三","adhdg");
        User u2 = new User("002","李四","oiunhjk");
        User u3 = new User("003","王武","khguno");
        list.add(u1);
        list.add(u2);
        list.add(u3);

        // 调用方法
        boolean flag = inList(list,"001");
        System.out.println(flag);



    }
    //        定义一个方法，根据id查找对应的用户信息，如存在，返回true，如不存在，返回false
    public static boolean inList(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;
    }
}
