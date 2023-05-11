package com.model;

import javax.persistence.*;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String aName;
	private String aBook;
	
	public Author() {
		super();
	}
	
	public Author(String aName, String aBook) {
		super();
		this.aName = aName;
		this.aBook = aBook;
	}

	public Author(int aId, String aName, String aBook) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aBook = aBook;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaBook() {
		return aBook;
	}

	public void setaBook(String aBook) {
		this.aBook = aBook;
	}


}
