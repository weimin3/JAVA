package Practical7;

public class StudentsTest {
    public static void main(String[] args) {
        //创建数组
        Students[] arr = new Students[3];

        //创建学生对象添加到数组中
        Students s1 = new Students(1,"zhangsan",23);
        Students s2 = new Students(2,"lisi",24);
        Students s3 = new Students(3,"wangwu",25);
        //将对象添加到数组中
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Students s4 = new Students(4,"zhaoliu",26);
        //唯一性判断
        boolean flag = inArr(arr,s4.getId());
        if(flag){
            //已存在：---不用添加
            System.out.println("当前id重复，请修改id后再进行添加");

        } else{
            //不存在：---将学生对象添加进数组
            //把s4添加到数组中。
            //数组已经存满---创建一个新数组，新数组长度=老数组+1
            //数组未存满----直接添加
            int count = getCount(arr);
            if(count ==arr.length){
                //已经存满
                Students[] newArr= creatNewArr(arr);
                newArr[count]=s4;
                printArr(newArr);

            }else{
                //没有存满
                arr[count]=s4;
                printArr(arr);

            }

            //要求：通过id删除学生信息，如存在，则删除，如不存在，则提示删除失败。删除完毕后，遍历所有学生信息。
            //找到id在数组中对应的索引
            int index = getIndex(arr,2);
            //如存在，则删除；如果不存在，则提示删除失败
            if(index >= 0){
                //存在，则删除，即把index上的元素设置为null
                arr[index]=null;
                //删除后，遍历所有学生信息
                printArr(arr);
            }else{
                //不存在，提示删除失败
                System.out.println("当前id不存在，删除失败");
            }
        //5. 查询数组id为"3"的学生，如存在，则将其年龄+1岁
            //获取id为3的索引
            int index1= getIndex(arr,3);
            //判断索引，索引大于等于0，存在
            if (index1 >= 0) {
                //存在则年龄+1
                arr[index1].setAge(arr[index1].getAge()+1);
                //遍历数组
                printArr(arr);
            }else{
                System.out.println("当前id不存在");
            }




        }




    }


    //定义方法判定数组中有几个元素
    public static int getCount(Students[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;

    }

    //定义唯一性判定的方法
    public static boolean inArr(Students[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id ){
                    return true;
                }

            }

        }
        return false;
    }

    //定义方法创建新数组，长度=老数组的长度+1，然后将老数组的元素拷贝到新数组中
    public static Students[] creatNewArr(Students[] arr){
        Students[] newArr = new Students[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    //定义方法遍历数组
    public static void printArr(Students[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
            }
        }
    }

    //定义方法找到id在数组中的索引
    public static int getIndex(Students[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    return i;
                }
            }

        }
        //循环接收后还未找到，则表示不存在，
        return -1;
    }


}
