package collection;

import classDemo.student;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();
        student s = new student("make",28);
        student s2 = new student("tubu",24);
        list.add(s);
        list.add(s);
        list.add(s2);

        for(student s1: list){
            System.out.println(s1.toString());
        }

        Iterator<student> it =  list.iterator();

        while(it.hasNext()){

            System.out.println(it.next().toString());
        }
    }
}
