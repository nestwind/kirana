package com.kirana.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User_Addr_PK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String USER_ID;
	private String USER_ADDR_SL_NO;	

}
