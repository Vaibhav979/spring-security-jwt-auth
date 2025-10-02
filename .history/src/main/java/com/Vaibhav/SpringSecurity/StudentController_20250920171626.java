package com.Vaibhav.SpringSecurity;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "Vaibhav", 85),
            new Student(2, "Ankit", 90),
            new Student(3, "Rohit", 78)
    ));
    
    @GetMapping("/student")
    public List<Student> getStudents() {

    }
}
