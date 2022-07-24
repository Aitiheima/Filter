package com.itheima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public FilterDemo2() {
        super();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2....");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Filter4");
    }

    @Override
    public void destroy() {

    }
}
