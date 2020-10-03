package com.yiming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: firstweb
 * @Description:
 * @Author: YiMing
 * @Created: 2020/10/03 22:55
 */
@WebServlet(name = "ServletLife")
public class ServletLife extends HttpServlet {

    /**
     * 完成Servlet对象的初始化工作
     * 在servlet第一次接收请求时，创建对象
     * 生命周期：从第一次接收请求时开始---到服务器关闭之后销毁
     * 当在web.xml文件中配置了<load-on-startup>1</load-on-startup>，则servlet对象会在开启tomcat时创建，标签中的数值表示优先级
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("servlet life");
        System.out.println("Learn servlet life");
    }

    @Override
    public void destroy() {
        System.out.println("I'm destroy");
    }
}
