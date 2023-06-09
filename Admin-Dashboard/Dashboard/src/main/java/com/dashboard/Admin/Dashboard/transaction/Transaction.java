package com.dashboard.Admin.Dashboard.transaction;


import com.dashboard.Admin.Dashboard.users.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fromAccountNo;

    private String toAccountNo;
    private String transactionType;
    private Double amount;
    private String transactionDescription;
    private LocalDateTime transactionTime;
    @ManyToOne
    private Users userId;

}
