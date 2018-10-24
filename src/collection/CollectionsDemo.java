package collection;


import classDemo.student;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("make");
        list.add("wo");
        list.add("tubu");
        list.add("is");
        list.add("haha");

        System.out.println(list);
        //自然排序
        Collections.sort(list);
        System.out.println(list);

        //反转顺序
        Collections.reverse(list);
        System.out.println(list);

        //随机乱序
        Collections.shuffle(list);
        System.out.println(list);

        student[] students = {new student("闫妮",25),new student("谭卓",28)
                ,new student("徐薇",24)} ;

        List<student> lists = Arrays.asList(students);
        System.out.println(lists);
        Collections.sort(lists,new Comparator<student>(){
            @Override
            public int compare(student t1, student t2) {
                int num = t1.getName().compareTo(t2.getName());
                return (num == 0) ? t1.getAge() - t2.getAge() : num;
            }
        }  );
        System.out.println(lists);

    }

}
