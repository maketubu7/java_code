package UtilityClassDemo;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
       // System.out.println(calendar);
        //System.out.println(calendar.getFirstDayOfWeek());
        //System.out.println(calendar.G);
        int year = calendar.YEAR;
        int month = calendar.MONTH;
        int day = calendar.DATE;

        System.out.println(calendar.get(year));
        //月份进行加1   要写在get方法的结果上进行增加
        System.out.println(calendar.get(month) + 1);
        System.out.println(calendar.get(day));
        //输出本年一共有多少周  52
        int weeksInWeekYear = calendar.getWeeksInWeekYear();
        System.out.println(weeksInWeekYear);

        //输出当前日期为本月的第几周
        int i = calendar.get(calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(i);
        CalendarDemo cd = new CalendarDemo();
       cd.get2moth_days(2019);

    }
    //计算一个年份的2月有多少天
    public void get2moth_days(Integer yyyy){
        Calendar calendar = Calendar.getInstance();
        calendar.set(yyyy,02,01);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(yyyy + "年的2月有："+ calendar.get(calendar.DATE)+ "天");
    }
}
