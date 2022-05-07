package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"john","johnj@gmail.com", LocalDate.of(1995, Month.APRIL,5),26)
        );
    }


}
