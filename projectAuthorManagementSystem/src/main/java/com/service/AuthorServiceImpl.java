package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthorRepository;
import com.model.*;
import java.util.*;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository authorRepo;
	
	public void addAuthor()
	{
			ArrayList<Author> aList = new ArrayList<Author>();
			aList.add(new Author("Ram","Rajputana"));
			aList.add(new Author("Veer","Life"));
			
			for(Author e : aList)
			{
				authorRepo.save(e);
			}
	}
}
