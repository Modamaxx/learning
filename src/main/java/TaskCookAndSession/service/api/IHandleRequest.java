package TaskCookAndSession.service.api;

import TaskCookAndSession.model.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IHandleRequest {
   void save(HttpServletRequest req, HttpServletResponse resp, Person person);
   Person get(HttpServletRequest req);
}
