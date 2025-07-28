package com.bank.securebank.repository;

import com.bank.securebank.model.AccountTransactions;
import com.bank.securebank.model.Loans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions,String> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(Long customerId);
}
