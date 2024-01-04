package com.codingstreams.interfaceprojection.service;

import com.codingstreams.interfaceprojection.model.Contact;
import com.codingstreams.interfaceprojection.repository.ContactsRepository;
import com.codingstreams.interfaceprojection.repository.projection.ContactOverview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactsServiceImpl implements ContactsService {
  private final ContactsRepository contactsRepository;

  @Override
  public Contact getContactDetails(String contactId) {
    return contactsRepository.findById(contactId)
        .orElseThrow();
  }

  @Override
  public ContactOverview getContactOverviewDetails(String contactId) {
    return contactsRepository.findContactById(contactId);
  }
}
