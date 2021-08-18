package Task3.controller.web.servlet;


import Task3.model.Person;
import Task3.service.Validation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "Registration", urlPatterns = "/signUp")
public class Registration extends HttpServlet {
    public final static ArrayList<Person> users = new ArrayList<Person>();
    private final Validation validation;

    public Registration() {
        this.validation =Validation.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        if (validation.validRegistration(req.getParameter("login"), req.getParameter("password"),
                req.getParameter("fio"), req.getParameter("password"))) {
            Person person = new Person();
            person.setLogin(req.getParameter("login"));
            person.setPassword(req.getParameter("password"));
            person.setFio(req.getParameter("fio"));
            person.setBirthday(req.getParameter("birthday"));
            users.add(person);

            HttpSession session= req.getSession();
            session.setAttribute("person",person);

            req.setAttribute("person",person);
            req.getRequestDispatcher("/views/menu.jsp").forward(req, resp);
        }
        else {
            req.setAttribute("error","you have not entered all the data or this username is already occupied");
            req.getRequestDispatcher("/views/signUp.jsp").forward(req, resp);
        }
    }
}
