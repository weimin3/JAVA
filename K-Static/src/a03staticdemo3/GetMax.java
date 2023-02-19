package a03staticdemo3;

import java.util.ArrayList;

public class GetMax {
    private GetMax(){}

    public static int maxage(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempage = list.get(i).getAge();
            if(max < tempage){
                max = tempage;
            }
        }
        return max;
    }
}
