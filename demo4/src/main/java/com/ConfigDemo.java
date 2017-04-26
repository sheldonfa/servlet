package com;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author fangxin
 * @date 2017/4/26.
 */
public class ConfigDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 同样是getInitParameter，config和context是不一样的
         */
        ServletConfig config = getServletConfig();
        String encoding = config.getInitParameter("encoding");
        ServletContext context = getServletContext();
        String encoding1 = context.getInitParameter("encoding");
        System.out.println(encoding);
        System.out.println(encoding1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
