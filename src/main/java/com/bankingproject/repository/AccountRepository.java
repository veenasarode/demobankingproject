package com.bankingproject.repository;

import com.bankingproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account , Long> {
}
