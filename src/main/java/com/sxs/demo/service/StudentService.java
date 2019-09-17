package com.sxs.demo.service;

import com.sxs.demo.pojo.Student;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:48
 * Description: No Description
 **/
public interface StudentService {
    String sayHello(Integer number);

    String save(Student student);
}
