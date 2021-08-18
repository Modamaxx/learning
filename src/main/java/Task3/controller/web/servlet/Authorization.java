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

@WebServlet(name = "Authorization", urlPatterns = "/signIn")
public class Authorization extends HttpServlet {
    private final Validation validation;

    public Authorization() {
        this.validation = Validation.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/views/signIn.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person p = validation.validAuthorization(req.getParameter("login"), req.getParameter("password"));
        if (p!=null) {
            HttpSession session= req.getSession();
            session.setAttribute("person",p);

            req.setAttribute("person", p);
            req.getRequestDispatcher("/views/menu.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "The data entered is incorrect, or you have not registered");
            req.getRequestDispatcher("/views/signIn.jsp").forward(req, resp);
        }


    }
}
