package com.dashboard.Admin.Dashboard.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public  String homePage(Model model){
        model.addAttribute("template","dashboard.html");
//        model.addAttribute("style","css/app.css");
        return "base";
    }
    @GetMapping("/charts")
    public  String chartsPage(Model model){
        model.addAttribute("template","charts.html");
//        model.addAttribute("style","css/app.css");
        return "base";
    }
    @GetMapping("/profile")
    public  String profilePage(Model model){
        model.addAttribute("template","profile.html");
//        model.addAttribute("style","css/app.css");
        return "base";
    }
    @GetMapping("/blank")
    public  String blankPage(Model model){
        model.addAttribute("template","blank.html");
//        model.addAttribute("style","css/app.css");
        return "base";
    }

}
