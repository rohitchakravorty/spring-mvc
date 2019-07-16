package main.java;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Configuration
@Controller
public class UserController {
    User user=new User("Rohit",21);
    @GetMapping("/")
    public ModelAndView user()
    {
       ModelAndView mv=new ModelAndView("index");
       mv.addObject("name",user.getName());
       return mv;
    }


}
