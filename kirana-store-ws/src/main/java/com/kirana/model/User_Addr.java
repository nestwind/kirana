package com.kirana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="KIRANA_USER_ADDR")
@Table(name="KIRANA_USER_ADDR")
@IdClass(User_Addr_PK.class)
public class User_Addr {
	
	@Id
	private String USER_ID;
	
	@Column(name="USER_ADDR_NAME", nullable = false)
	private String USER_ADDR_NAME;
	
	@Id
	@Column(name="USER_ADDR_SL_NO", nullable = false)
	private String USER_ADDR_SL_NO;
	
	@Column(name="USER_ADDR_LINE_1", nullable = false)
	private String USER_ADDR_LINE_1;
	
	@Column(name="USER_ADDR_LINE_2")
	private String USER_ADDR_LINE_2;
	
	@Column(name="USER_ADDR_CITY", nullable = false)
	private String USER_ADDR_CITY;
	
	@Column(name="USER_ADDR_PIN", nullable = false)
	private String USER_ADDR_PIN;
	
	@Column(name="USER_ADDR_STATE", nullable = false)
	private String USER_ADDR_STATE;
	
	@Column(name="USER_ADDR_COUNTRY", nullable = false)
	private String USER_ADDR_COUNTRY;
	
	@Column(name="USER_ADDR_MOB", nullable = false)
	private String USER_ADDR_MOB;
	
	@Column(name="USER_ADDR_EMAIL", nullable = false)
	private String USER_ADDR_EMAIL;

}
