package com.example.JSON;

import com.example.entity.Student;
import com.example.utils.RelectUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student(10,"WANGWU");
        String str = RelectUtil.jsonObject(student);
        request.setAttribute("key",student);
        request.setAttribute("key1",str);
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
