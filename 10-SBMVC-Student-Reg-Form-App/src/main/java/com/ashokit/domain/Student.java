package com.ashokit.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private String pwd;
	private String email;
	private Long phno;
	private String course;
	private String gender;
	private String[] preferedTime;

}
