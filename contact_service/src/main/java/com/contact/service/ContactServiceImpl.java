package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list =List.of(
			new Contact(1L, "garuavrana@gmail.com", "Gaurav", 1311L),
			new Contact(2L, "ankit@gmail.com", "Ankit", 1312L),
			new Contact(1L, "saurav2003@gmail.com", "Saurav", 1311L),
			new Contact(3L, "sachin1999@gmail.com", "Sachin", 1314L)
			);
	
	@Override
	public List<Contact> getContactsOfUsers(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
