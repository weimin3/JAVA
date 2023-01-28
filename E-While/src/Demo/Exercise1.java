package Demo;
//珠穆朗玛峰8844430毫米，一张纸厚度0.1毫米，这张纸折多少次能达到珠峰的高度？
public class Exercise1 {
    public static void main(String[] args) {
        int count = 0;
        double height = 0.1;
        //因为只知道循环结束条件，所以用while循环
        while(height <= 8844430){
            /*折一下：厚度 0.1 * 2 = 0.1 * 2[^1]
              折两下：厚度 0.1 * 2 * 2 = 0.1 * 2[^2]
              折三下：厚度 0.1 * 2 * 2 *2 =0.1 * 2[^3]
              ...
             */
            count++;
            height *= 2;

        }
        System.out.println("一张0.1毫米的纸折" + count + "次可到达8844430毫米");
    }
}
