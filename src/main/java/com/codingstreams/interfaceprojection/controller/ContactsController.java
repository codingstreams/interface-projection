package com.codingstreams.interfaceprojection.controller;

import com.codingstreams.interfaceprojection.service.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactsController {
    private final ContactsService contactsService;
    
    @GetMapping("/{contactId}")
    public ResponseEntity<?> getContactDetails(@PathVariable String contactId){
        var contact = contactsService.getContactDetails(contactId);
        return ResponseEntity.ok(contact);
    }

    @GetMapping("/overview/{contactId}")
    public ResponseEntity<?> getContactOverviewDetails(@PathVariable String contactId){
        var contact = contactsService.getContactOverviewDetails(contactId);
        return ResponseEntity.ok(contact);
    }
}
