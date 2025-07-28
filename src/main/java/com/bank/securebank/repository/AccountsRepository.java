package com.bank.securebank.repository;

import com.bank.securebank.model.Accounts;
import org.springframework.data.repository.CrudRepository;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(Long customerId);
}
