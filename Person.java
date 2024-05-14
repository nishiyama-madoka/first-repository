package com.example.profileapp;
//entity
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Person implements Serializable {

	private Long id;
	
	private String email;
	
	private String name;
	
	private String selfIntroduction;
	
	private String password;
	
	private Date createdAt;
	
	private Date updatedAt;

	public record UserAccount(String email,String password) {}
	
}
