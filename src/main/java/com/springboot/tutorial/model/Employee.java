package com.springboot.tutorial.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

	private int id;

	private String name;

	private int age;

	private String gender;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joiningDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate retiringDate;

	private String dept;

}
