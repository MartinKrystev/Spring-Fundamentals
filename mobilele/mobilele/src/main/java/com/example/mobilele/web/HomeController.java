package com.example.mobilele.web;

import com.example.mobilele.repositories.UserRoleRepository;
import com.example.mobilele.services.userrole.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController{
    private final UserroleService userroleService;

    @Autowired
    public HomeController(UserroleService userroleService) {
        this.userroleService = userroleService;
    }

    @GetMapping("home")
    public ModelAndView getHome() {

        return super.view("index");
    }

//    @GetMapping("home")
//    public String addDbRoles() {
//        this.userroleService.dn
//
//    }

}
