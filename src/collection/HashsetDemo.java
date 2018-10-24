package collection;

import classDemo.student;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static jdk.nashorn.internal.objects.Global.println;
import static sun.misc.Version.print;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        s.add("张飞");
        s.add("刘备");
        s.add("关羽");
        s.add("吕布");
        s.add("吕布");
        s.add("吕布");
        System.out.println(s.contains("貂蝉"));

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String str : s){
            System.out.println(str);
        }

        Set<student> s1 = new HashSet<student>();
        //对于引用对象，相同的若想唯一，
        // 则需重写equals和hashcode方法
        s1.add(new student("make",24));
        s1.add(new student("tubu",23));
        s1.add(new student("joe",23));
        s1.add(new student("leo",23));
        s1.add(new student("jack",21));
        s1.add(new student("jack",21));
        s1.add(new student("jack",21));

        for(student ss : s1){

            System.out.println(ss.toString());
        }
    }

}
