package com.Vaibhav.SpringSecurity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import Student; // Removed or replace with correct package import if needed, e.g.:
// import com.Vaibhav.SpringSecurity.Student;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "Vaibhav", 85),
            new Student(2, "Ankit", 90),
            new Student(3, "Rohit", 78)));

    @GetMapping("/student")
    public List<Student> getStudents() {
        return students;
    }
}
