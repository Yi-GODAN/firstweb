package com.yiming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: firstweb
 * @Description: Servlet
 * @Author: YiMing
 * @Created: 2020/10/04 08:18
 */

/**
 * Servlet类中可以有service方法，用来接收get或post请求
 * 如果service和doGet或doPost同时存在，那么默认调用service方法
 * 如果在service方法实现中调用了super.service()会根据请求跳转到doGet或doPost
 *
 * doPost()：用来接收post请求
 * doGet()：用来接收get请求
 *
 * 总结：在编写servlet类时，不需要重新实现service方法，只需要重写doGet和doPost方法即可，用来接收get和post请求
 */
public class MethodServlet extends HttpServlet {
    //doPost()：用来接收post请求
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是Post");
    }

    //doGet()：用来接收get请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是get");
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("我是service");
//    }
}
