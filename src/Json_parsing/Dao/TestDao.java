package Json_parsing.Dao;

import Json_parsing.Bean.Score;
import Json_parsing.Bean.Student;

/*
这里只有两张表，只设计一个dao类
 */
public interface TestDao {
    int addstudent(Student stu);
    int addscore(Score sc);
}
