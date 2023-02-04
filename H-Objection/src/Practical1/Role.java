package Practical1;

import java.util.Random;

/*
文字版格斗游戏：
> 游戏中每个角色的姓名，血量都不同。选定人物时，信息就被确定下来。
> 模拟回合版游戏：例如："乔峰举起拳头打了鸠摩智以下，造成XX点伤害，鸠摩智还剩下xxx点血"，最后判断谁的血量先为0
 */
//定义角色
public class Role {
    //定义角色属性
    private String name;
    private int blood;
   // 生成空参
    public Role(){

    }
   //生成全参
    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }

    //定义行为攻击:方法的调用者攻击参数
    public void attack(Role role){
        //计算造成的伤害，伤害1-20随机
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //限制剩余血量的取值范围，不能是复数
        remainBlood = remainBlood< 0? 0 : remainBlood;
        //修改挨揍人的血量
        role.setBlood(remainBlood);
        //this表示方法的调用者
        System.out.println(this.getName()+ "举起拳头打了"+ role.getName()+ "一下，造成" + hurt + "点伤害，"+ role.getName()+"还剩下" + remainBlood+"点血");

    }










}
