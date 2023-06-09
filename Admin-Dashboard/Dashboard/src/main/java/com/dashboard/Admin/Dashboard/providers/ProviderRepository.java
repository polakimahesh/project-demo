package com.dashboard.Admin.Dashboard.providers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Integer> {
//    List<Provider> findByGatewayName(String gatewayName);

    List<Provider> findByGatewayNameIgnoreCase(String gatewayName);

}
