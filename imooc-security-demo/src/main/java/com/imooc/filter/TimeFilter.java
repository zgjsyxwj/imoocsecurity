package com.imooc.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Time filter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Time filter start!");
        long start=new Date().getTime();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Time filter:"+(new Date().getTime()-start));
        System.out.println("Time filter finish!");
    }

    @Override
    public void destroy() {
        System.out.println("Time filter destroy!");
    }
}
