import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //创建集合存储学生信息
        ArrayList<Student> list = new ArrayList<>();
        while(true){
            //调用主界面方法，并接收用户的选择
            String input = intface();
            // 根据输入值调用不同的方法：添加学生，删除学生，修改学生信息，查询学生信息，退出
            switch(input){
                case "1" -> addStudent(list);
                case "2" -> delInfor(list);
                case "3" -> editArr(list);
                case "4" -> query(list);
                default -> {
                    System.out.println("退出");
                    System.exit(0);
                }
            }
        }


    }
    //定义方法显示主菜单
    public static String intface(){
        System.out.println("-------------------欢迎登陆学生管理系统-------------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        return input1;
    }

    //定义添加学生方法
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        //创建学生对象
        Student s = new Student();
        while(true){
            System.out.println("请输入学生id:");
            String id = sc.next();
            //调用方法判断id是否已存在
            boolean flag = idInArr(list,id);
            if(flag){
                System.out.println("id已存在，请重新输入：");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生地址：");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);

        System.out.println("学生信息添加成功");
        //intface();

    }

    //定义方法判断id 是否已经存在，返回true/false
    public static boolean idInArr(ArrayList<Student> list,String id){
        int index = idInArrIndex(list,id);
        if(index >= 0){
            return true;
        }else{
            return false;
        }

    }
    //定义方法判断id 是否已经存在，返回索引
    public static int idInArrIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    //定义方法删除学生信息，键盘录入要删除的学生的id,如存在则删除，如不存在则提示不存在，并返回初始菜单
    public static void delInfor(ArrayList<Student> list){
        System.out.println("请输入要删除的学生的id:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        // 调用方法判断id是否在集合中,并返回索引
        int index1= idInArrIndex(list,id);
        if(index1 >=0){
            list.remove(index1);
            System.out.println("id是" + id + "的学生信息已删除");
        }else{
            System.out.println("此id不存在");
            //返回主页
            intface();
        }
    }

    /* 定义修改方法，键盘录入要修改的学生id,
    id存在，继续录入其他信息
    id不存在，提示不存在，返回主菜单
     */
    public static void editArr(ArrayList<Student> list){
        //键盘录入要修改的学生id
        System.out.println("请输入要修改的学生的id:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        //调用方法判断id是否存在,返回索引
        int index  = idInArrIndex( list,id);
        if(index >=0){
            //存在，继续录入其他信息
            System.out.println("请输入学生姓名：");
            String newName = sc.next();
            list.get(index).setName(newName);

            System.out.println("请输入学生年龄：");
            int newAge = sc.nextInt();
            list.get(index).setAge(newAge);

            System.out.println("请输入学生地址：");
            String newAddress = sc.next();
            list.get(index).setAddress(newAddress);

            System.out.println("学生信息修改成功");

        }else{
            //不存在，提示不存在
            System.out.println("此id不存在");
            //返回主菜单
            intface();

        }

    }

    /* 定义方法查询学生信息
        打印所有学生信息：
        如果没有学生信息，提示：当前无学生信息，请添加后再查询
        如有学生信息则输出
         */
    public static void query(ArrayList<Student> list){
        int length = list.size();
        if(length == 0){
            System.out.println("当前无学生信息，请添加后再查询");
        }else{
            System.out.println("id          姓名          年龄          家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"    " +list.get(i).getName() + "    " +list.get(i).getAge() + "    " +list.get(i).getAddress());
            }
        }

    }
}