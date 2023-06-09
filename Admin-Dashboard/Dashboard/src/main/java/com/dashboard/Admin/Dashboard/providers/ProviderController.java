package com.dashboard.Admin.Dashboard.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProviderController {
    @Autowired
    private ProviderService providerService;
    @GetMapping("/providers")
    public String getProviders(Model model){
        Provider providers = new Provider();
        model.addAttribute("template","provider.html");
        model.addAttribute("title","Providers");
//        model.addAttribute("style","provider.css");
        model.addAttribute("provider",providers);
        return "base";
    }
    @GetMapping("/providers/{gatewayName}")
    public String getParticularProviderMerchants(Model model, @PathVariable String gatewayName){
        model.addAttribute("allProviderUsers",providerService.getAllUserOfThatProvider(gatewayName));
        model.addAttribute("template","gateway.html");
        model.addAttribute("title","payment gateways");
        return  "base";
    }
    @PostMapping("/add")
    public  String saveProvider(@ModelAttribute Provider provider){
        providerService.save(provider);
        return "redirect:/providers";
    }


}
