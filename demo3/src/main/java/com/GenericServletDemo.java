package com;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * 继承GenericServlet方式创建自定义Servlet
 */
public class GenericServletDemo extends GenericServlet {
    /**
     * 提供了getServletContext方法
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }
}
