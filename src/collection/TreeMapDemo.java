package collection;

import classDemo.student;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, student> tmp = new TreeMap<Integer, student>();
        // key不重复，key 按照自然排序
        tmp.put(01,new student("罗辑",28));
        tmp.put(04,new student("蓝色空间",28));
        tmp.put(01,new student("执剑人",28));
        tmp.put(02,new student("程心",28));
        tmp.put(03,new student("艾AA",28));


        Map<student, Integer> tmp1 = new TreeMap<student, Integer>(
              new Comparator<student>(){
                          @Override
                          public int compare(student t1, student t2) {
                              int num = t1.getName().compareTo(t2.getName());
                              return (num == 0) ? t1.getAge() - t2.getAge() : num;
                          }  }  );
        // key不重复，key 按照自然排序                Set<Map.Entry<Integer, student>> entries = tmp.entrySet();
        tmp1.put(new student("罗辑",28),1);
        tmp1.put(new student("蓝色空间",28),2);
        tmp1.put(new student("执剑人",28),1);
        tmp1.put(new student("程心",28),2);
        tmp1.put(new student("艾AA",28),99);

        Set<Map.Entry<student, Integer>> ens = tmp1.entrySet();
        
        for (Map.Entry e : ens){
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
