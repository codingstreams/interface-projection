package com.codingstreams.interfaceprojection.repository;

import com.codingstreams.interfaceprojection.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends CrudRepository<Contact, String> {

}
