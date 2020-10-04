package com.yiming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Program: firstweb
 * @Description:
 * @Author: YiMing
 * @Created: 2020/10/04 11:32
 */

/**
 * HttpServletRequest用来存放客户端请求的参数
 * 请求行
 * 请求头
 * 请求体
 */
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        System.out.println("post request");
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        System.out.println("get request");
        //获取请求行数据
        //获取请求中的请求方式
        String method = request.getMethod();
        System.out.println(method);
        //获取请求的完整地址
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
        //获取请求中的资源路径
        String uri = request.getRequestURI();
        System.out.println(uri);
        //获取请求中的协议
        String scheme = request.getScheme();
        System.out.println(scheme);

        //获取请求头数据
        //根据key获取value的值
        String userAgent = request.getHeader("User-Agent");
        System.out.println(userAgent);
        //获取请求头信息中的key的枚举对象
        Enumeration<String> headerNames = request.getHeaderNames();
        System.out.println(headerNames);
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + ":" + value);
        }

        //获取用户请求数据
        //无论请求方式是post还是get，获取用户数据方式不变
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println("name:"+name);
        System.out.println("password:"+pwd);
        //获取用户数据中的所有key
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }
        //获取相同key的多个数据，例如：checkbox
        String[] favs = request.getParameterValues("fav");
        for (String str : favs) {
            System.out.println(str);
        }
        //其它常用方法
        //获取远程客户端的地址
        String remoteAddr = request.getRemoteAddr();
        //获取远程客户端的主机名称
        String remoteHost = request.getRemoteHost();
        //获取远程客户端的端口号
        int remotePort = request.getRemotePort();
        System.out.println(remoteAddr + ":" + remoteHost + ":" + remotePort);

        String localAddr = request.getLocalAddr();
        String localName = request.getLocalName();
        System.out.println(localAddr+":"+localName);
    }
}
