package com.github.sigma.blog.actions;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// TODO: @WebFilter(urlPatterns = "/*")
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}