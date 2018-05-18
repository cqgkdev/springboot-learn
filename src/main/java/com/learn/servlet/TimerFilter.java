package com.learn.servlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class TimerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest,servletResponse );

        System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }
}
