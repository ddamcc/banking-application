package com.bank.securebank.repository;

import com.bank.securebank.model.Cards;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardsRepository extends CrudRepository<Cards,Long> {
    List<Cards> findByCustomerId(Long customerId);
}
