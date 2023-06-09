package com.dashboard.Admin.Dashboard.providers;


import com.dashboard.Admin.Dashboard.users.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gatewayName;
    @ManyToOne
    private Users users;
}
