package SerializableDemo;

import java.io.*;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datas\\student.sr"));
//
//        oos.writeObject(new Student("周杰伦",34));
//
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datas\\student.sr"));

        //如果在序列化对象到磁盘后，对对象的类进行了修改，再进行反序列化，则会报错如下
        //stream classdesc serialVersionUID = -3280132915254613630,
        // local class serialVersionUID = -1278396977806346914
        //因为对象的类进行了修改，不一样了，在进行类型转换的过程中就会报错

        //需要对序列化的类加上seriailzableUID 进行唯一id认证
        Student student = (Student) ois.readObject();
        System.out.println(student);
        student.play();
        student.eat();







    }
}
