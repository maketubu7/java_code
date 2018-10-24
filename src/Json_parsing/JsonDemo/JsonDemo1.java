package Json_parsing.JsonDemo;

import Json_parsing.Bean.Grades;
import Json_parsing.Bean.Student;
import net.sf.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo1 {
    public static void main(String[] args) {
//        ObjectMapper mapper = new ObjectMapper();
        JsonDemo1 j1 = new JsonDemo1();
        try {
            String json_res = j1.getJson("E:\\idea_workspace\\java_code_review\\datas\\josn_grade.json");
            System.out.println(json_res);
            JSONObject jsonObject = JSONObject.fromObject(json_res);
//            可以先定义Map classMap = new HashMap();在classMap中put你要转换的类中的集合名，
//            比如:classMap.put("teachers", Teacher.class);然后在toBean()的时候把参数加上，
//            例如：Student student=(Student) JSONObject.toBean(str, Student.class, classMap);
            Map classMap = new HashMap();
            classMap.put("students",Student.class);
            Grades grades = (Grades)JSONObject.toBean(jsonObject, Grades.class, classMap);
            System.out.println("==========================");
            System.out.println(grades.getName());

            List<Student> s = grades.getStudents();

            System.out.println(s.size());
            for (Student s1 : s){
               System.out.println(s1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public String getJson(String path) throws IOException {
        //读取文件(字符流)
        BufferedReader in = null;
        //这里主要是涉及中文
        //BufferedReader in = new BufferedReader(new FileReader("d:\\1.txt")));
        //写入相应的文件
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream
                    (path), "GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //读取数据
        //循环取出数据
        String str = null;
        StringBuilder sb = new StringBuilder();

        while ((str = in.readLine()) != null) {
//            System.out.println(str);
            //写入相关文件
            sb.append(str);
        }
        //关闭流
        in.close();
        return sb.toString();
    }
}
