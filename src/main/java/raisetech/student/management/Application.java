package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private StudentCourseRepository studentCourseRepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/studentList")
  public List<Student> getStudent() {
    return studentRepository.search();
  }

  // /studentCourseList でデータを取得
  @GetMapping("/studentCourseList")
  public List<StudentCourse> getStudentCourse() {
    return studentCourseRepository.search();
  }
}