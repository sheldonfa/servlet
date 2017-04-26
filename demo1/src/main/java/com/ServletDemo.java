package com;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author fangxin
 * @date 2017/4/26.
 */
public class ServletDemo implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet 初始化了");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("servlet 销毁了");
    }
}
