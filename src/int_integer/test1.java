package int_integer;

public class test1 {
    public static void main(String[] args) {
//        eq1();
//        eq2();
//        eq3();
        eq4();
//        eq5();


    }

    private static void eq2() {
        Integer i1 = new Integer(100);
        Integer i2 = 100;

        System.out.println(i1 == i2);
    }
    private static void eq3() {
        Integer i1 = new Integer(100);
        Integer i3 = 100;
        int i2 = 100;
        System.out.println(i1 == i2);
        System.out.println(i3 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i2));
    }
    private static void eq4() {
        Integer i1 = -128;
        Integer i2 = -128;
        System.out.println(i1 == i2);
    }
    private static void eq5() {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

    private static void eq1() {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);
    }
}
