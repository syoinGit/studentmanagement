package raisetech.student.management.servise;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentCourse;
import raisetech.student.management.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    List<Student> studentList = repository.search();

    return studentList.stream()
        .filter(student -> student.getAge() >= 20 && student.getAge() <= 29)
        .collect(Collectors.toList());

  }

  public List<StudentCourse> searchStudentCourse() {
    List<StudentCourse> studentCoursesList = repository.searchStudentCourse();

    return studentCoursesList.stream()
        .filter(course -> course.getCourseName().equals("Valorantで学ぶ精密な目標達成と意思決定"))
        .collect(Collectors.toList());
  }
}
