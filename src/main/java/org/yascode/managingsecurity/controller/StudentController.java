package org.yascode.managingsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.yascode.managingsecurity.util.PathConstants.Student.*;

@RestController
@RequestMapping(value = STUDENT_PATH)
public class StudentController {

    @GetMapping(STUDENT_HI)
    public String hiStudent(){
        return "HI STUDENT";
    }

    @GetMapping(STUDENT_GET)
    public String getStudent(){
        return "My Name is Yassin";
    }

}
