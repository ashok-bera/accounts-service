package com.easybank.accounts.repos;

import com.easybank.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    /**
     * Retrieves an Optional containing a Customer entity based on the provided mobile number.
     *
     * @param mobileNumber the mobile number of the customer to be retrieved
     * @return an Optional containing the Customer entity if found, otherwise an empty Optional
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
