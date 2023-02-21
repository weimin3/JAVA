package a06extenddemo6;

public class Test {
    public static void main(String[] args) {
        Ppathelaoe pp = new Ppathelaoe("zs",22);
        System.out.println(pp.getName() + "," +pp.getAge());
        pp.speach();
        pp.learn();

        BasketAthelator bb = new BasketAthelator("ls",23);
        System.out.println(bb.getName() + "," +bb.getAge());
        bb.learn();

        BasketCoach bc = new BasketCoach("ww",40);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.teach();

        PpCoach pc = new PpCoach("zl",43);
        System.out.println(pc.getName() + "," + pc.getAge());
        pc.teach();
        pc.speach();



    }
}
