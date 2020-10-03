package com.yiming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: firstweb
 * @Description:
 * @Author: YiMing
 * @Created: 2020/10/03 21:34
 */
public class MyServletSecond extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Welcome ^_^");
        System.out.println("welcome");
    }
}
