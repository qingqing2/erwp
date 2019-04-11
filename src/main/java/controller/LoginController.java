package controller;

import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(Admin user, HttpServletRequest request) {
        Admin user1 = loginService.findUser(user);
        HttpSession session = request.getSession();
        if (null == user1) {
            return "no";
        }
        session.setAttribute("admin", user1);
        return "yes";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String update(Admin user) {
        loginService.updateUser(user);
        return "1";
    }


}
