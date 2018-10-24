package UtilityClassDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
        //日期类型解析为字符串
        System.out.println(dateFormat.format(dt));
        //对应的解析日期字符串要对应 相符合的pattern,即匹配模式
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date parse2 = dateFormat2.parse("2018年06月22日 19:45:36");

        SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date parse3 = dateFormat3.parse("2018/06/22 19:45:36");

        System.out.println(parse2);
        System.out.println(parse3);

    }

}
