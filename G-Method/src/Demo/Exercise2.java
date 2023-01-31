package Demo;
//练习：定义方法，比较两个长方形的面积
public class Exercise2 {
    public static void main(String[] args) {
        int area1 = area(2,3);
        int area2 = area(5,6);
        System.out.println("较大长方形的面积为：" + (area1 > area2? area1 : area2));
    }

    public static int  area(int length, int width) {
        int area = length * width;
        return area;

    }
}
