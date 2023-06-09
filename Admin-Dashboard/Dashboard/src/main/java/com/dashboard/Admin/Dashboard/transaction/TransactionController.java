package com.dashboard.Admin.Dashboard.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;


    @GetMapping("/transactions")
    public String getAllTransaction(Model model){
        model.addAttribute("allTransaction",transactionService.getAllTransaction());
        model.addAttribute("template","transaction.html");
        model.addAttribute("style","transaction.css");
        model.addAttribute("title","Transaction");
        return "base";
    }

    @GetMapping("/transactions/{id}")
    public String getSingleUser(@PathVariable("id") int id, Model model){
        model.addAttribute("singleTransactionDetails",transactionService.getAllTransactionBySingleUser(id));
        model.addAttribute("template","transactionDetails.html");
        return "base" ;
    }


}
