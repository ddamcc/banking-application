package com.bank.securebank.repository;

import com.bank.securebank.model.Loans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoansRepository extends CrudRepository<Loans,Long> {
    List<Loans> findByCustomerIdOrderByStartDtDesc(Long customerId);
}
