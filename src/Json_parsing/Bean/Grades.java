package Json_parsing.Bean;



import java.util.List;

public class Grades {

        private String name;//班级名称
        private List<Student> students;//班里的所有学生

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public List<Student> getStudents() {
            return this.students;
        }
        public void setStudents(List<Student> students) {
            this.students = students;
        }

    }

