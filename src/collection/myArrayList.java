package collection;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String args[]){
        //创建集合对象
        ArrayList<Integer> alist = new ArrayList<Integer>();

        alist.add(12);
        alist.add(45);
        alist.add(46);
        System.out.println("====**按索引添加**====");
        alist.add(2,47);
        //是否存在
        if (alist.contains(48)){
            System.out.println("存在48");
        }else{
            System.out.println("不存在48");
        }
        //删除指定元素 按index
        alist.remove(2);
        //删除指定元素 按元素 int类型强转为类型(Object)
        int fourtyeight = 48;
        alist.remove(((Integer) 48));
        int len = alist.size();

        int l1 = alist.get(0);
        int l2 = alist.get(1);
        //全部删除
        for(int a : alist){
            System.out.println(a);
        }
    }
}
