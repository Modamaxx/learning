package WorkingClassroom.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "WorkingClassroom.controllers.HelloServlet", urlPatterns = "/test")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String firstName = req.getParameter("firstName");


        if (firstName == null) {
            Cookie[] cookies = req.getCookies();
            if(cookies!=null){
                firstName = Arrays.stream(cookies)
                        .filter(c -> "firstName".equalsIgnoreCase(c.getName()))
                        .map(Cookie::getValue)
                        .findFirst()
                        .orElse(null);}
        }
        Cookie cookie = new Cookie("firstName", firstName);
        cookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toDays(5)));
        resp.addCookie(cookie);



        writer.write("Hello " + firstName);

    }

}
