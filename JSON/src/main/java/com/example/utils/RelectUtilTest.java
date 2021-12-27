package com.example.utils;

import com.example.entity.Student;
import org.junit.Test;

public class RelectUtilTest {
    @Test
    public void test() {
        Student student = new Student(1,"lisi");
        RelectUtil.jsonObject(student);
    }
}
