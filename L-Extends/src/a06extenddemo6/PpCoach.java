package a06extenddemo6;

public class PpCoach extends Coach implements Speach{
    public PpCoach() {
    }

    public PpCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speach() {
        System.out.println("说英语");
    }
}
