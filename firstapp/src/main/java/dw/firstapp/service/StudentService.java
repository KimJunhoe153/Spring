package dw.firstapp.service;

import dw.firstapp.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
    public int getStudentScore(Student student) {
        System.out.println(student.getFirstName() + student.getLastName());
        return 100;
    }

    @GetMapping("/student/score/{firstName}/{lastName}")
    public int getStudentScore(@PathVariable String firstName,
                               @PathVariable String lastName) {
        Student student = new Student(firstName, lastName);
        StudentService studentService = new StudentService();
        return studentService.getStudentScore(student);
    }
}
