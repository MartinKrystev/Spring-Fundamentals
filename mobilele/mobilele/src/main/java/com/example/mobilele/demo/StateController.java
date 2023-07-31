package com.example.mobilele.demo;

import com.example.mobilele.domain.views.UserRegisterFormDto;
import com.example.mobilele.web.BaseController;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class StateController extends BaseController {

    @GetMapping("/register")
    public ModelAndView getRegister() {
        return super.view("demo/register");
    }

    @PostMapping("/registerTestMe")
    public ModelAndView postRegister(HttpServletResponse response,
                                     @RequestParam(name = "username") String username) {
        Cookie cookie = new Cookie("username", username);

        response.addCookie(cookie);

        return super.redirect("/login");
    }

    @PostMapping("/register")
    public ModelAndView postRegister(UserRegisterFormDto userRegisterForm, HttpSession httpSession) {

        httpSession.setAttribute("username", userRegisterForm.getUsername());

        return super.redirect("/demo/login");
    }

    @GetMapping("/loginTestMe")
    public ModelAndView getLogin(ModelAndView modelAndView,
                                 @CookieValue(name = "username",
                                 defaultValue = "") String username) {

        modelAndView.addObject("username", username);

        return super.view("demo/login", modelAndView);
    }

    @GetMapping("/login")
    public ModelAndView getLogin2(ModelAndView modelAndView, HttpSession httpSession) {

        String fetchedUsername = httpSession.getAttribute("username").toString();

        modelAndView.addObject("username", fetchedUsername);

        return super.view("/demo/login", modelAndView);
    }
}
