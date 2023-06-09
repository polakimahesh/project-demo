package com.dashboard.Admin.Dashboard.transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    public List<Transaction> getAllTransaction(){
        return transactionRepository.findAll();
    }

    public  List<Transaction> getAllTransactionBySingleUser(int id){
        return transactionRepository.findByUserId_Id(id);
    }
}
