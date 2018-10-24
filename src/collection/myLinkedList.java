package collection;

import classDemo.student;

import java.util.LinkedList;
import java.util.List;

public class myLinkedList {
    public static void main(String[] args) {
        student s = new student("make",28);
        student s2 = new student("tubu",24);

        List<student> list = new LinkedList<student>();

        list.add(s);
        list.add(s);
        list.add(s);
        list.add(s);
        list.add(s);
        list.add(0,s2);
        list.add(list.size(),s2);
        System.out.println(list.get(5).toString());
        for(student s1 : list){

            System.out.println(s1.getName() + ":" + s1.getAge());
        }
    }
}
