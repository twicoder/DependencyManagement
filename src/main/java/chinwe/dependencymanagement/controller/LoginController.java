package chinwe.dependencymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(LoginForm loginForm){
        System.out.println(loginForm);
        return "redirect:/home";
    }

}
