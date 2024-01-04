package com.codingstreams.interfaceprojection.service;

import com.codingstreams.interfaceprojection.model.Contact;
import com.codingstreams.interfaceprojection.repository.projection.ContactOverview;

public interface ContactsService {
    Contact getContactDetails(String contactId);

    ContactOverview getContactOverviewDetails(String contactId);
}
