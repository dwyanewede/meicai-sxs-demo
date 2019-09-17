package com.sxs.demo.repository;

import com.sxs.demo.pojo.Student;
import com.sxs.demo.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Create User: shangke
 * Create Time: 2019/9/16 18:48
 * Description: StudentRepository
 **/
@Component
public class StudentRepository {

    @Autowired
    private RedisUtil redisUtil;

    public Student getStuByNumber(Integer number) {
        return (Student) redisUtil.get(String.valueOf(number));
    }

    public boolean saveStu(Student student) {
        return redisUtil.set(String.valueOf(student.getStuNumber()), student);
    }
}
