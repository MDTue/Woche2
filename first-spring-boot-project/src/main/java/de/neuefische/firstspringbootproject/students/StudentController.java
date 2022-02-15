package de.neuefische.firstspringbootproject.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")


    public class StudentController {
        @GetMapping
        public String getStudent(){
            List<Studenten> students = new ArrayList<Studenten>();



            return "Oskar";
        }

    }




