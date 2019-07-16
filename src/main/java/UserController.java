package main.java;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Configuration
@Controller
public class UserController {


    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request)
    {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        User user = new User(username, password);
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("output", username);
        return mv;

    }
}
