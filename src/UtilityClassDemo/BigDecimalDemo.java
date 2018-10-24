package UtilityClassDemo;
import java.math.BigDecimal;
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301/100);
        /*
        0.5 -- 1/2
        0.75 -- 1/2 + 1/4
        很多是表示不精确的
         */
        //这个值为十进制 精度高
        System.out.println(new BigDecimal("0.09").add(new BigDecimal("0.01")));
        System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.32")));
        System.out.println(new BigDecimal("1.015").multiply(new BigDecimal("100")));
        System.out.println(new BigDecimal("1.301").divide(new BigDecimal("100")));
    }
}
