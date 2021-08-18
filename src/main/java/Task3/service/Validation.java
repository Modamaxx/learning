package Task3.service;

import Task3.controller.web.servlet.Registration;
import Task3.model.Person;

public class Validation {

    private static final Validation instance = new Validation();

    private Validation() {

    }

    public boolean validRegistration(String login, String password, String fio, String date) {

        if ((login.equals("")) || (password.equals("")) || (fio.equals("")) || (date.equals(""))) {
            return false;
        }
        for (Person p:Registration.users) {
            if(login.equals(p.getLogin())){
                return false;
            }
        }
        return true;
    }

    public Person validAuthorization(String login, String password) {
        for (Person p : Registration.users) {
            if ((p.getLogin().equals(login)) && (p.getPassword().equals(password))) {
                return p;
            }
        }
        return null;
    }

    public static Validation getInstance() {
        return instance;
    }
}
