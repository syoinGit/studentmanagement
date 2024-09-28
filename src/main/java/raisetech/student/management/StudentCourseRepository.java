package raisetech.student.management;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.management.StudentCourse;

@Mapper
public interface StudentCourseRepository {

  @Select("SELECT * FROM students_courses")  // テーブル名を修正
  List<StudentCourse> search();
}