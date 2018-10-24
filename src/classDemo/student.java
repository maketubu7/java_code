package classDemo;

import java.util.Objects;

public class student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {

        System.out.println(Objects.hash(name, age));
        return Objects.hash(name, age);

    }
    /*
    @Override
    public int compareTo(student obj) {
        //return this.getAge() - obj.getAge();
        return 1;
    }*/
}
