package com.sxs.demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:46
 * Description: School
 **/
@Data
public class School implements Serializable {
    private static final long serialVersionUID = 5083167660378210357L;

    private String scName;
    private Integer scNumber;
    private String scAdress;
}
