package Json_parsing.Bean;

import java.util.Map;

/**
 *  学生
 *   根据大括号，中括号，以及括号里的内容来定义实体类
 *   若括号内的内容不确定，并且不一样，可参照用可变list,map来进行定义
 *   如这里的score   就用map进行定义
 */
public class Student {

    private int age;//年龄
    private String gender;//性别，male/female
    private String grades;//班级
    private String name;//姓名
    private Map<String, Double> score;//各科分数
    private String scoreId;    //与score表关联的唯一id
    private Double weight;//体重

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(int age, String gender, String grades, String name, String scoreId, Double weight) {
        super();
        this.age = age;
        this.gender = gender;
        this.grades = grades;
        this.name = name;
        this.weight = weight;
        this.scoreId=scoreId;
    }

    public String getScoreId() {
        return scoreId;
    }
    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGrades() {
        return grades;
    }
    public void setGrades(String grades) {
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Double> getScore() {
        return score;
    }
    public void setScore(Map<String, Double> score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", gender=" + gender + ", grades=" + grades + ", name=" + name + ", score="
                + score + ", weight=" + weight + "]";
    }
}