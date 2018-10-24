package classDemo;

import java.util.Comparator;

public class MyComparator implements Comparator<student>{
    @Override
    public int compare(student t1, student t2) {
        System.out.println("^_^^_^^_^");
        int num = t1.getName().compareTo(t2.getName());
        return (num == 0) ? t1.getAge() - t2.getAge() : num;
    }
}
