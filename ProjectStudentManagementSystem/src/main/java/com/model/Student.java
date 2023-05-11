package com.model;

import javax.persistence.*;

@Entity
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String name;
		
		
}
