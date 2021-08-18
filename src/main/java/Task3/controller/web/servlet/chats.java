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
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

@WebServlet(name="chats", urlPatterns = "/chats")
public class chats extends HttpServlet {
    public final static ArrayList<Person> users=new ArrayList<Person>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/chats.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Person person= (Person) session.getAttribute("person");


       String recipient= req.getParameter("recipient");
        for (Person p:Registration.users) {
            if(p.getLogin().equals(recipient)){
                p.getLetters().add(new Letter(LocalDate.now().toString(),person.getLogin(),req.getParameter("message")));
            }
        }
         String path = req.getContextPath() + "/views/menu.jsp";
         resp.sendRedirect(path);
    }
}
