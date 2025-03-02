package com.easybank.accounts.repos;

import com.easybank.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    // we are mentioning transactional so that JPA gets to know this is a update query and
    // it should use the transaction so that it is safe to use(query either should execute completely or not at all)
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
