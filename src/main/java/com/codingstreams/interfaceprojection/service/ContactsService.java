package com.codingstreams.interfaceprojection.service;

import com.codingstreams.interfaceprojection.model.Contact;

public interface ContactsService {
    Contact getContactDetails(String contactId);
}
