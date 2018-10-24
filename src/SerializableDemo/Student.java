package SerializableDemo;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 3024288571168312114L;
    private String name;
    private transient int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  void play(){
        System.out.println(this.name + "喜欢英雄联盟" + "今年" + this.age);
    }
    public  void eat(){
        System.out.println(this.name + "喜欢吃西瓜");
    }


}
