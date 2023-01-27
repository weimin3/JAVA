package Demo1;
//自动驾驶车遇红灯停止，遇绿灯行驶，遇黄灯减速
public class Exercise1 {
    public static void main(String[] args) {
        boolean isGreenLight = true;
        boolean isRedLight = false;
        boolean isYellowLight = false;
        if(isGreenLight){
            System.out.println("move on ");
        }
        if(isRedLight){
            System.out.println("stop!");
        }
        if(isYellowLight){
            System.out.println("slow down");
        }
    }
}
