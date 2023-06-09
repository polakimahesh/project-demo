package com.dashboard.Admin.Dashboard.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;


    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<Users> users=usersService.getAllUsers();
        model.addAttribute("alluserlist",users);
        model.addAttribute("template","users.html");
//        model.addAttribute("style","users.css");
        model.addAttribute("title","Users");
        return "base";
    }



    @GetMapping("/users/{id}")
    public String getSingleUser( Model model,@PathVariable("id") int id){
        Users user = usersService.getSingleUser(id);

        if(user!=null) {
            model.addAttribute("singleUser", usersService.getSingleUser(id));
            model.addAttribute("template", "singleUser.html");
            return "base" ;
        }else{
            return "error";
        }


    }
    @GetMapping("/register-user")
    public String addNewUser(Model model){
        Users users = new Users();
        model.addAttribute("user",users);
        model.addAttribute("template","newUser.html");
        model.addAttribute("title","Register-User");
        return "base";
    }
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("users") Users users) {
        usersService.save(users);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public  String deleteUser( @PathVariable int id){
        usersService.deleteUserById(id);
        return "redirect:/users";
    }

    @GetMapping("/register-user/{id}")
    public String updateUser(Model model,@PathVariable("id") int id){
        Users users = usersService.getSingleUser(id);
        model.addAttribute("user",users);
        model.addAttribute("template","newUser.html");
        model.addAttribute("title","Update-User");
        return "base";
    }

}
