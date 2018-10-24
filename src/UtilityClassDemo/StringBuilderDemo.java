package UtilityClassDemo;

import classDemo.student;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        //可以添加对象，会默认调用tostring方法
        stringBuilder.append("hello").append(" world ");
        stringBuilder.append(new student("maketubu",24));
        System.out.println(stringBuilder);
        //offset  插入的初识位置
        stringBuilder.insert(6,"good ");
        System.out.println(stringBuilder);
        //翻转位置
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        long start = System.currentTimeMillis();
        for(int i = 1; i < 1000000;i++){
//            arrbuilderformat(arr);       //180ms
            arrbufferformat(arr);          //190ms
        }
        long end = System.currentTimeMillis();

       System.out.println(end - start);
    }

    public static  void arrbuilderformat(int[] arr){
        StringBuffer sb = new StringBuffer("[");

        for(int i = 1;i<arr.length;i++){

            if(i != arr.length - 1){
                sb.append(arr[i]).append(",");
            }else{
                sb.append(arr[i]).append("]");
            }
        }
        //System.out.println(sb);
    }
    public static  void arrbufferformat(int[] arr){
        StringBuilder stringBuilder = new StringBuilder("[");

        for(int i = 1;i<arr.length;i++){

            if(i != arr.length - 1){
                stringBuilder.append(arr[i]).append(",");
            }else{
                stringBuilder.append(arr[i]).append("]");
            }
        }
        //System.out.println(stringBuilder);
    }
}
