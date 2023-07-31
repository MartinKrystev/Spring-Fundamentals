package com.example.mobilele.web;

import com.example.mobilele.domain.views.UserRegisterFormDto;
import com.example.mobilele.domain.views.UserRoleViewDto;
import com.example.mobilele.services.init.DbInitImpl;
import com.example.mobilele.services.userrole.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController{
    private final UserroleService userroleService;

    @Autowired
    public UserController(UserroleService userroleService) {
        this.userroleService = userroleService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {
        this.userroleService.dbInit();
        List<UserRoleViewDto> userroleServiceAll = this.userroleService.getAll();
        modelAndView.addObject("roles", userroleServiceAll);
        modelAndView.addObject("userRegister", new UserRegisterFormDto());

        return super.view("auth-register", modelAndView);
    }

    @PostMapping("/register")
    public ModelAndView postRegister(UserRegisterFormDto userRegisterFormDto) {

        return super.redirect("auth-login");
    }


}
