package com.sxs.demo.service.impl;

import com.sxs.demo.pojo.Student;
import com.sxs.demo.repository.StudentRepository;
import com.sxs.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:51
 * Description: StudentServiceImpl
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String sayHello(Integer number) {
        Student stu = studentRepository.getStuByNumber(number);
        if (null == stu)
            return "学生信息不存在";
        else return stu.getStuName();
    }

    @Override
    public String save(Student student) {
        boolean flag = studentRepository.saveStu(student);
        if (flag)
            return "success";
        else return "false";
    }
}
