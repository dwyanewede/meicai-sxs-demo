package com.sxs.demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:39
 * Description: Student
 **/
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -58835679374783759L;

    private String stuName;
    private Integer stuNumber;
    private Integer stuSex;
    private Integer stuAge;
    private Integer stuScore;
}
