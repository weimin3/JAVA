package Practical1;

public class GameTest {
    public static void main(String[] args) {
        // 创建第一个角色
        Role role1= new Role("乔峰",100);
        //创建第二个角色
        Role role2 = new Role("鸠摩智",100);

        //开始格斗，回合制游戏
        while(true){
            //role1攻击role2
            role1.attack(role2);
            //判断role2的剩余血量
            if(role2.getBlood()==0){
                System.out.println(role1.getName()+"K.O了" + role2.getName());
                break;
            }

            //role2攻击role1
            role2.attack(role1);
            //判断role1的剩余血量
            if(role1.getBlood()==0){
                System.out.println(role2.getName() + "K.O了"+ role1.getName());
                break;
            }
        }
    }
}
