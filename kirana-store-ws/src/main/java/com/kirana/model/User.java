package com.kirana.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="KIRANA_USER")
@Table(name="KIRANA_USER")
public class User {
	
	@Id	
	@Column(name="USER_ID", nullable = false)
	private String USER_ID;
	
	@Column(name="USER_PASS", nullable = false)
	private char[] USER_PASS;
	
	@Column(name="USER_FNAME", nullable = false, length = 20)
	private String USER_FNAME;
	
	@Column(name="USER_MNAME", length = 20)
	private String USER_MNAME;
	
	@Column(name="USER_LNAME", length = 20)
	private String USER_LNAME;
	
	@Column(name="USER_MOB", nullable = false, length = 15)
	private String USER_MOB;
	
	@Column(name="USER_EMAIL", nullable = false, length = 30)
	private String USER_EMAIL;
}
