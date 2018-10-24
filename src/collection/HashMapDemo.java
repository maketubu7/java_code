package collection;

import classDemo.student;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<String,Integer>();
        /*
        mp.put("关羽",30);
        mp.put("关平",13);
        mp.put("关兴",17);
        mp.put("刘备",34);
        mp.put("刘无能",13);
        mp.put("曹操",50);
        mp.put("曹植",21);

        Set<String> keys = mp.keySet();

        for(String key : keys){
            System.out.println(key + ":" + mp.get(key));
        }*/

        Map<Integer,student> mp1 = new HashMap<Integer,student>();

        mp1.put(001,new student("关羽",30));
        mp1.put(002,new student("关平",13));
        mp1.put(002,new student("关兴",17));
        mp1.put(004,new student("刘备",34));
        mp1.put(005,new student("刘无能",13));
        mp1.put(006,new student("曹操",50));
        mp1.put(007,new student("曹植",21));

        Set<Integer> keys = mp1.keySet();
        //第一种
        for(int key : keys){
            System.out.println(key + ":" + mp1.get(key).toString());
        }
        //第二种

        Set<Map.Entry<Integer, student>> ets = mp1.entrySet();

        for(Map.Entry e : ets){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
