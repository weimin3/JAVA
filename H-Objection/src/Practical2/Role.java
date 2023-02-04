package Practical2;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;
    private String gender;
    private String looks;


    //对面容对描述
    String[] boylooks={"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girllooks={"美轮美奂","成鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};

    //对攻击的描述
    String[] attcks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去",
            "%s使出一招【游空探爪】，飞起身形自半空中变掌为爪锁向%s",
            "%s大喝一声，身形下伏，一招【霹雷坠地】，锤向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实锤向%s",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环功向%s"};
    //对受伤的描述
    String[] injureds_desc = {
            //血量>90
            "结果%s退了半步，毫发无伤",
            //血量80～90
            "结果给%s造成一处瘀伤",
            //血量70~80
            "结果一击命中，%s得弯下腰",
            //60-70
            "结果%s痛苦地闷哼了一声，显然受了一点内伤",
            //40-60
            "结果%s摇摇晃晃，一跤摔倒在地",
            //20-40
            "结果%s脸色一下变得惨白，连退了好几步",
            // 10 - 20
            "结果【轰】的一声，%s口中献血狂喷而出",
             //小于10
            "结果%s一声惨叫，像滩烂泥般塌了下去"};

    //空参构造方法
    public Role(){

    }

    //全参构造方法
    public Role(String name, int blood, String gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setLooks(gender);


    }

    //private 属性设置set和get值

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

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setLooks(String gender){
        Random r = new Random();
        //长相根据性别随机，
        if(gender == "男"){
            //从boylooks数组中随机
            int index = r.nextInt(boylooks.length);
            this.looks = boylooks[index];
        }else if(gender == "女"){
            //从girllooks数组中随机
            int index = r.nextInt(girllooks.length);
            this.looks = girllooks[index];
        }else{
            this.looks = "惨不忍睹";
        }

    }

    public String getLooks(){
        return looks;
    }

    //定义攻击行为
    public void attack(Role role){
        //输出攻击信息
        Random r = new Random();
        int index = r.nextInt(attcks_desc.length);
        String kunfu = attcks_desc[index];
        System.out.printf(kunfu,this.getName(),role.getName());
        System.out.println();



        // 定义掉的血量,1-20之间随机
        int hurt = r.nextInt(20)+1;

        //定义剩余血量,不可是负数
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood<0 ? 0 : remainBlood;

        //重新设置挨揍人血量
        role.setBlood(remainBlood);

        //受伤描述
        if(remainBlood > 90){
            System.out.printf(injureds_desc[0],role.getName());

        } else if(remainBlood > 80){
            System.out.printf(injureds_desc[1],role.getName());

        } else if (remainBlood > 70) {
            System.out.printf(injureds_desc[2],role.getName());

        } else if (remainBlood > 60) {
            System.out.printf(injureds_desc[3],role.getName());

        } else if (remainBlood > 40) {
            System.out.printf(injureds_desc[4],role.getName());

        } else if (remainBlood > 20) {
            System.out.printf(injureds_desc[5],role.getName());
        } else if (remainBlood > 10) {
            System.out.printf(injureds_desc[6],role.getName());
        } else {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();

    }

    //定义方法展示角色所有信息
    public void showRoleInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getLooks());
    }


}
