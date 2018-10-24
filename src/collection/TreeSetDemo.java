package collection;

import classDemo.MyComparator;
import classDemo.student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //默认基本排序
        Set<String> set = new TreeSet<String>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday ");
        set.add("Sunday ");

        for(String str : set){
            System.out.println(str);
        }
        /*
        Set<student> ss = new TreeSet<student>();

        ss.add(new student("孙悟空",800));
        ss.add(new student("沙悟净",1500));
        ss.add(new student("二郎神",500));
        ss.add(new student("牛魔王",400));
        ss.add(new student("紫霞仙子",1700));
        ss.add(new student("猪无能",300));

        for(student s : ss){
            System.out.println(s.toString());
        }*/

        //传入比较器的set 上面为实现comparator方法的student类
        Set<student> sc = new TreeSet<student>(new MyComparator());

        sc.add(new student("孙悟空",800));
        sc.add(new student("沙悟净",1500));
        sc.add(new student("二郎神",500));
        sc.add(new student("牛魔王",400));
        sc.add(new student("紫霞仙子",1700));
        sc.add(new student("猪无能",300));

       // for(student s : sc){
        //    System.out.println(s.toString());
        //}
        //传入匿名内部类实现    都只实现了age的比较，不满足现实情况
        //这里实现的为  两个都要进行比较
        Set<student> sc1 = new TreeSet<student>(new Comparator<student>(){

            @Override
            public int compare(student t1, student t2) {
                int num = t1.getName().compareTo(t2.getName());
                return (num == 0) ? t1.getAge() - t2.getAge() : num;
            }
        });

        sc1.add(new student("孙悟空",800));
        sc1.add(new student("沙悟净",1500));
        sc1.add(new student("二郎神",500));
        sc1.add(new student("牛魔王",400));
        sc1.add(new student("赤脚大仙",400));
        sc1.add(new student("紫霞仙子",1700));
        sc1.add(new student("猪无能",300));
        sc1.add(new student("猪无能",300));

        for(student s : sc1){
            System.out.println(s.toString());
        }

    }


}
