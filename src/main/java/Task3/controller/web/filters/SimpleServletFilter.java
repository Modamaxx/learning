package Task3.controller.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {""})
public class SimpleServletFilter implements Filter {
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
