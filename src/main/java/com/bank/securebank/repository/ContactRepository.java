package com.bank.securebank.repository;

import com.bank.securebank.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact,String> {}
