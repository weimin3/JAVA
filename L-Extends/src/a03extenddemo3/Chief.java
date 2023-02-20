package a03extenddemo3;

public class Chief extends Employ{
    public Chief() {
    }

    public Chief(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(){
        System.out.println("炒菜");
    }
}
