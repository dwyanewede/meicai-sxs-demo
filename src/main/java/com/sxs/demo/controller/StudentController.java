package com.sxs.demo.controller;

import com.sxs.demo.pojo.Student;
import com.sxs.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:36
 * Description: StudentController
 **/
@RestController()
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(){
        return "HELLO WORLD !";
    }
    @GetMapping("/sayHello")
    public String sayHello(@RequestParam Integer number){
        return studentService.sayHello(number);
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Student student){
        return studentService.save(student);
    }
}
