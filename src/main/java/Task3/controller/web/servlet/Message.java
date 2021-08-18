package Task3.controller.web.servlet;

import Task3.model.Letter;
import Task3.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static Task3.controller.web.servlet.Registration.users;

@WebServlet(name="Message",urlPatterns = "/Message")
public class Message extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Person person=(Person)session.getAttribute("person");
        req.setAttribute("letters",person.getLetters());

        req.getRequestDispatcher("/views/message.jsp").forward(req, resp);


    }
}
