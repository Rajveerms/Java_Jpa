package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AuthorServiceImpl;

@RestController
public class AuthorController {

	@Autowired
	AuthorServiceImpl authorImpl;
	
	@PostMapping("/save")
	public void addAuthor()
	{
		authorImpl.addAuthor();
	}
	
}
