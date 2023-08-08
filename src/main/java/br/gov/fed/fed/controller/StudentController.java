package br.gov.fed.fed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fed.fed.entities.Student;

@RestController
@RequestMapping("students")


public class StudentController {
    
    @GetMapping
    public List<Student> getStudents(){

        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student();

        s1.setCourse("ADS");
        s1.setId(01);
        s1.setName("Valdir");

        Student s2 = new Student();

        s2.setCourse("AMS");
        s2.setId(02);
        s2.setName("Vladmir");

        list.add(s1);
        list.add(s2);

        
        return list;
    }


}
