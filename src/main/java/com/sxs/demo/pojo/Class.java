package com.sxs.demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:47
 * Description: School
 **/
@Data
public class Class implements Serializable {
    private static final long serialVersionUID = -1967637405791538014L;
    private String clName;
    private Integer clNumber;
}
