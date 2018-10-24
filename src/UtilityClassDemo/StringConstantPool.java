package UtilityClassDemo;

public class StringConstantPool {
    public static void main(String[] args) {
        /*
        string为引用类型
         */
        String s1 = "赵丽颖";
        String s2 = "赵丽颖";
        String s3 = new String("赵丽颖");

        System.out.println(s1 == s2);      //true
        System.out.println(s1.equals(s2));   //true
        System.out.println(s1 == s3);    //false

        String s4 = "赵丽颖1";
        String s5 = "赵丽颖" + 1;

        System.out.println(s4 == s5);    //true
        System.out.println(s4.equals(s5));    //true

        String s6 = "梅西";
        String s7 = "C罗";
        String s8 = "梅西C罗";
        String s9 = s6 +  s7;
        System.out.println(s8 == s9);     //false
        System.out.println(s8.equals(s9));    //true

    }
}
