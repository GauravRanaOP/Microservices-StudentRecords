package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUsers(Long userId);
}
